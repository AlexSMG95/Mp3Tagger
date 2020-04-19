package Supporting;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.datatype.Artwork;
import org.jaudiotagger.tag.id3.ID3v23Tag;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.jaudiotagger.tag.FieldKey.*;

public class TagSetter {

    public static void setTag (File mp3, String trackName, String artistName, String albumName, String url, String pathJpgName)
            throws TagException, ReadOnlyFileException, CannotReadException, InvalidAudioFrameException,
            IOException, CannotWriteException {

        AudioFile audioFile = AudioFileIO.read(mp3);
        audioFile.setTag(new ID3v23Tag());
        Tag newTag = audioFile.getTag();
        newTag.setField(ALBUM, albumName);
        newTag.setField(ARTIST, artistName);
        newTag.setField(TITLE, trackName);
        try {
            URL art = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) art.openConnection();

            BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
            File f1 = new File(String.valueOf(pathJpgName));
            FileOutputStream fw = new FileOutputStream(f1);

            byte[] b = new byte[1024];
            int count = 0;

            while ((count=bis.read(b)) != -1)
                fw.write(b,0,count);

            fw.close();
        } catch (IOException ex) {
        }
        Artwork artwork = Artwork.createArtworkFromFile(new File(pathJpgName));
        newTag.addField(artwork);
        newTag.setField(artwork);
        audioFile.commit();
    }
}
