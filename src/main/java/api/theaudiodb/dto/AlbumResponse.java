package api.theaudiodb.dto;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class AlbumResponse {

    @SerializedName("album") private List<Album> album = null;

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }

}