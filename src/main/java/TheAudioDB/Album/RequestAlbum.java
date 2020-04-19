package TheAudioDB.Album;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RequestAlbum {
    String artistName;
    String albumName;

    public String Request(String albumId) throws UnirestException {
        String json = Unirest.get("https://www.theaudiodb.com/api/v1/json/1/album.php?m={albumid}")
                .routeParam("albumid", albumId)
                .asString()
                .getBody();
        return json;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

}
