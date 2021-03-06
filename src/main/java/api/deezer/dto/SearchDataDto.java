package api.deezer.dto;

import com.google.gson.annotations.SerializedName;

public class SearchDataDto {

    @SerializedName("id") private Integer id;
    @SerializedName("readable") private Boolean readable;
    @SerializedName("title") private String title;
    @SerializedName("title_short") private String title_short;
    @SerializedName("title_version") private String title_version;
    @SerializedName("link") private String link;
    @SerializedName("duration") private Integer duration;
    @SerializedName("rank") private Integer rank;
    @SerializedName("explicit_lyrics") private Boolean explicit_lyrics;
    @SerializedName("explicit_content_lyrics") private Integer explicit_content_lyrics;
    @SerializedName("explicit_content_cover") private Integer explicit_content_cover;
    @SerializedName("preview") private String preview;
    @SerializedName("artist") private ArtistDto artist;
    @SerializedName("album") private AlbumDto album;
    @SerializedName("type") private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getReadable() {
        return readable;
    }

    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_short() {
        return title_short;
    }

    public void setTitle_short(String title_short) {
        this.title_short = title_short;
    }

    public String getTitle_version() {
        return title_version;
    }

    public void setTitle_version(String title_version) {
        this.title_version = title_version;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getExplicit_lyrics() {
        return explicit_lyrics;
    }

    public void setExplicit_lyrics(Boolean explicit_lyrics) {
        this.explicit_lyrics = explicit_lyrics;
    }

    public Integer getExplicit_content_lyrics() {
        return explicit_content_lyrics;
    }

    public void setExplicit_content_lyrics(Integer explicit_content_lyrics) {
        this.explicit_content_lyrics = explicit_content_lyrics;
    }

    public Integer getExplicit_content_cover() {
        return explicit_content_cover;
    }

    public void setExplicit_content_cover(Integer explicit_content_cover) {
        this.explicit_content_cover = explicit_content_cover;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public ArtistDto getArtist() {
        return artist;
    }

    public void setArtist(ArtistDto artist) {
        this.artist = artist;
    }

    public AlbumDto getAlbum() {
        return album;
    }

    public void setAlbum(AlbumDto album) {
        this.album = album;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}