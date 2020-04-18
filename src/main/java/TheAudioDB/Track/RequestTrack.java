package TheAudioDB.Track;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RequestTrack {

    String artistName ;
    String trackName;

    public String Request(String artistName, String trackName) throws UnirestException {
        this.artistName = artistName;
        this.trackName = trackName;
        String json = Unirest.get("https://www.theaudiodb.com/api/v1/json/1/searchtrack.php?s={Artist_Name}&t={Single_Name}")
                .routeParam("Artist_Name", artistName)
                .routeParam("Single_Name", trackName)
                .asString()
                .getBody();
        System.out.println(json);
        return json;
    }
}
