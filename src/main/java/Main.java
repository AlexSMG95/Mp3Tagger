import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import TheAudioDB.Album.RequestAlbum;
import TheAudioDB.Album.RootAlbum;
import TheAudioDB.Track.RequestTrack;
import TheAudioDB.Track.RootTrack;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

public class Main {

    public static void main(String[] args)
            throws UnirestException, ReadOnlyFileException
            , IOException, TagException, InvalidAudioFrameException
            , CannotReadException, CannotWriteException ,NullPointerException{
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        GetFileList getFile = new GetFileList(path);
        for (int i = 0; i < GetFileList.listWithFileNames.size(); i++) {
            File mp3 = new File(String.valueOf(GetFileList.listWithFileNames.get(i)));
            try {
            Gson gson = new GsonBuilder().create();
            RequestTrack responseTrack = new RequestTrack();
            RequestAlbum responseAlbum = new RequestAlbum();
            RootTrack rootTrack = gson.fromJson(responseTrack.Request(getFile.getArtistName(i)
                                                , getFile.getTrackName(i))
                                                , RootTrack.class);
            RootAlbum rootAlbum = gson.fromJson(responseAlbum.Request(rootTrack.getTrack().get(0).getIdAlbum())
                                                , RootAlbum.class);
            TagSetter.setTag(mp3
                            , rootTrack.getTrack().get(0).getStrTrack()
                            , rootTrack.getTrack().get(0).getStrArtist()
                            , rootTrack.getTrack().get(0).getStrAlbum()
                            , rootAlbum.getAlbum().get(0).getStrAlbumThumb()
                            , getFile.getPath() + rootAlbum.getAlbum().get(0).getStrAlbum() + ".jpg");
            } catch (NullPointerException e) {
                getFile.unTaggetFileName(mp3);
            } catch (FileNotFoundException e) {
                getFile.unTaggetFileArt(mp3);
            }
        }
        System.out.println(GetFileList.listWithFileNamesUnTaggetName);
        System.out.println(GetFileList.listWithFileNamesUnTaggetArt);
    }
}

