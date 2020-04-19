package api;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class RequestDeezer {

        public String Request(String fileName) throws UnirestException, UnsupportedEncodingException {
        String json = String.valueOf(Unirest.get("https://deezerdevs-deezer.p.rapidapi.com/search?q=" + URLEncoder.encode(fileName, "UTF-8"))
                .header("x-rapidapi-host", "deezerdevs-deezer.p.rapidapi.com")
                .header("x-rapidapi-key", "b73a9146dcmshb911597d909a091p12e882jsnf27a31953b60")
                .asString()
                .getBody());
        return json;
    }

}
