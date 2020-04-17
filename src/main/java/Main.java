import java.util.Scanner;

import TheAudioDB.Artist.RequestArtist;
import TheAudioDB.Track.RequestTrack;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {
    public static void main(String[] args) throws UnirestException {
        Scanner scanner = new Scanner(System.in);

        GetFileList getFile = new GetFileList(scanner.nextLine());

        RequestArtist responseArtist = new RequestArtist();
        RequestTrack responseTrack = new RequestTrack();
        System.out.println(getFile.getArtistName(0));
        System.out.println(responseTrack.Request(getFile.getArtistName(0), getFile.getTrackName(0)));
    }
}
