package TheAudioDB.Artist;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RequestArtist {
    String artistName  ;

    public HttpResponse<String> Request(String artistName) throws UnirestException {
        this.artistName = artistName;
        HttpResponse<String> json = Unirest.get("https://www.theaudiodb.com/api/v1/json/1/search.php?s={Artist name}")
                .routeParam("Artist name", artistName)
                .asString();
        return json;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }
}
