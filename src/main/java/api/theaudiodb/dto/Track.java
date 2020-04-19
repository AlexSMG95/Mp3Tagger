package api.theaudiodb.dto;


public class Track {
    private String idTrack;
    private int idAlbum;
    private String idArtist;
    private String idLyric;
    private String strTrack;
    private String strAlbum;
    private String strArtist;
    private String intDuration;
    private String strGenre;
    private String intTrackNumber;
    private String intLoved;
    private String intTotalListeners;
    private String intTotalPlays;
    private String strMusicBrainzID;
    private String strMusicBrainzAlbumID;
    private String strMusicBrainzArtistID;
    private String strLocked;

    public String getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(String idTrack) {
        this.idTrack = idTrack;
    }

    public int getIdAlbum() { return idAlbum; }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public String getIdLyric() {
        return idLyric;
    }

    public void setIdLyric(String idLyric) {
        this.idLyric = idLyric;
    }

    public String getStrTrack() {
        return strTrack;
    }

    public void setStrTrack(String strTrack) {
        this.strTrack = strTrack;
    }

    public String getStrAlbum() {
        return strAlbum;
    }

    public void setStrAlbum(String strAlbum) {
        this.strAlbum = strAlbum;
    }

    public String getStrArtist() {
        return strArtist;
    }

    public void setStrArtist(String strArtist) {
        this.strArtist = strArtist;
    }

    public String getIntDuration() {
        return intDuration;
    }

    public void setIntDuration(String intDuration) {
        this.intDuration = intDuration;
    }

    public String getStrGenre() {
        return strGenre;
    }

    public void setStrGenre(String strGenre) {
        this.strGenre = strGenre;
    }

    public String getIntTrackNumber() {
        return intTrackNumber;
    }

    public void setIntTrackNumber(String intTrackNumber) {
        this.intTrackNumber = intTrackNumber;
    }

    public String getIntLoved() {
        return intLoved;
    }

    public void setIntLoved(String intLoved) {
        this.intLoved = intLoved;
    }

    public String getIntTotalListeners() {
        return intTotalListeners;
    }

    public void setIntTotalListeners(String intTotalListeners) {
        this.intTotalListeners = intTotalListeners;
    }

    public String getIntTotalPlays() {
        return intTotalPlays;
    }

    public void setIntTotalPlays(String intTotalPlays) {
        this.intTotalPlays = intTotalPlays;
    }

    public String getStrMusicBrainzID() {
        return strMusicBrainzID;
    }

    public void setStrMusicBrainzID(String strMusicBrainzID) {
        this.strMusicBrainzID = strMusicBrainzID;
    }

    public String getStrMusicBrainzAlbumID() {
        return strMusicBrainzAlbumID;
    }

    public void setStrMusicBrainzAlbumID(String strMusicBrainzAlbumID) {
        this.strMusicBrainzAlbumID = strMusicBrainzAlbumID;
    }

    public String getStrMusicBrainzArtistID() {
        return strMusicBrainzArtistID;
    }

    public void setStrMusicBrainzArtistID(String strMusicBrainzArtistID) {
        this.strMusicBrainzArtistID = strMusicBrainzArtistID;
    }

    public String getStrLocked() {
        return strLocked;
    }

    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }

}