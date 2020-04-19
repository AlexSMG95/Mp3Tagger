package api.deezer.dto;

import com.google.gson.annotations.SerializedName;

public class AlbumDto {

    @SerializedName("id") private Integer id;
    @SerializedName("title") private String title;
    @SerializedName("cover") private String cover;
    @SerializedName("cover_small") private String cover_small;
    @SerializedName("cover_medium") private String cover_medium;
    @SerializedName("cover_big") private String cover_big;
    @SerializedName("cover_xl") private String cover_xl;
    @SerializedName("tracklist") private String tracklist;
    @SerializedName("type") private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover_small() {
        return cover_small;
    }

    public void setCover_small(String cover_small) {
        this.cover_small = cover_small;
    }

    public String getCover_medium() {
        return cover_medium;
    }

    public void setCover_medium(String cover_medium) {
        this.cover_medium = cover_medium;
    }

    public String getCover_big() {
        return cover_big;
    }

    public void setCover_big(String cover_big) {
        this.cover_big = cover_big;
    }

    public String getCover_xl() {
        return cover_xl;
    }

    public void setCover_xl(String cover_xl) {
        this.cover_xl = cover_xl;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}