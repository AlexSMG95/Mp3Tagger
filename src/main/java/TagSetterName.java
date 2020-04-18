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

import java.io.File;
import java.io.IOException;

import static org.jaudiotagger.tag.FieldKey.*;

public class TagSetterName {

    public static void setTag (File mp3, String trackName, String artistName, String albumName)
            throws TagException, ReadOnlyFileException, CannotReadException, InvalidAudioFrameException,
            IOException, CannotWriteException {

        AudioFile audioFile = AudioFileIO.read(mp3);
        audioFile.setTag(new ID3v23Tag());
        Tag newTag = audioFile.getTag();
        newTag.setField(ALBUM, albumName);
        newTag.setField(ARTIST, artistName);
        newTag.setField(TITLE, trackName);
        audioFile.commit();
    }
}
