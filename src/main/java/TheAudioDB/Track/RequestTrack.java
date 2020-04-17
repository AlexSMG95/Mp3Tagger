package TheAudioDB.Track;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RequestTrack {

    String artistName ;
    String trackName;

    public String Request(String artistName, String trackName) throws UnirestException {
        this.artistName = artistName;
        this.trackName = trackName;
        String json = Unirest.get("https://www.theaudiodb.com/api/v1/json/1/searchtrack.php?s={Artist Name}&t={Single Name}")
                .routeParam("Artist Name", artistName)
                .routeParam("Single Name", trackName)
                .asString()
                .getBody();
        return json;
    }
}
