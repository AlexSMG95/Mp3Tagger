import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import TheAudioDB.Artist.RequestArtist;
import TheAudioDB.Artist.RootArtist;
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

    public static void main(String[] args) throws UnirestException, ReadOnlyFileException, IOException, TagException, InvalidAudioFrameException, CannotReadException, CannotWriteException {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        GetFileList getFile = new GetFileList(path);
        int i = 0;
        for (File mp3 : GetFileList.listWithFileNames) {
            Gson gson = new GsonBuilder().create();
            RequestArtist responseArtist = new RequestArtist();
            RequestTrack responseTrack = new RequestTrack();
            RootArtist rootArtist = gson.fromJson(responseArtist.Request(getFile.getArtistName(i)), RootArtist.class);
            RootTrack rootTrack = gson.fromJson(responseTrack.Request( getFile.getArtistName(i), getFile.getTrackName(i)), RootTrack.class);
            TagSetter.setTag(mp3, rootArtist.getArtists().get(0).getStrArtist(), rootTrack.getTrack().get(0).getStrTrack(), rootTrack.getTrack().get(0).getStrAlbum());
            i++;
        }
    }
}
