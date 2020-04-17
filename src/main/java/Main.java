import java.util.Scanner;

import TheAudioDB.Artist.RequestArtist;
import TheAudioDB.Artist.RootArtist;
import TheAudioDB.Track.RequestTrack;
import TheAudioDB.Track.RootTrack;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {

    public static void main(String[] args) throws UnirestException {
        Scanner scanner = new Scanner(System.in);

        GetFileList getFile = new GetFileList(scanner.nextLine());

        Gson gson = new GsonBuilder().create();
        RequestArtist responseArtist = new RequestArtist();
        RequestTrack responseTrack = new RequestTrack();
        System.out.println(getFile.getArtistName(0));
        System.out.println(getFile.getTrackName(0));

        RootArtist rootArtist = gson.fromJson(responseArtist.Request(getFile.getArtistName(0)), RootArtist.class);
        RootTrack rootTrack = gson.fromJson(responseTrack.Request( getFile.getArtistName(0), getFile.getTrackName(0)), RootTrack.class);
        System.out.println(rootTrack.getTrack().get(0).getStrAlbum());
    }
}
