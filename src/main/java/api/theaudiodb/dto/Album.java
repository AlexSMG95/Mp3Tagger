package TheAudioDB.Album;

import com.google.gson.annotations.SerializedName;

public class Album {

    @SerializedName("idAlbum") private String idAlbum;
    @SerializedName("idArtist") private String idArtist;
    @SerializedName("idLabel") private Object idLabel;
    @SerializedName("strAlbum") private String strAlbum;
    @SerializedName("strAlbumStripped") private String strAlbumStripped;
    @SerializedName("strArtist") private String strArtist;
    @SerializedName("strArtistStripped") private String strArtistStripped;
    @SerializedName("intYearReleased") private String intYearReleased;
    @SerializedName("strStyle") private String strStyle;
    @SerializedName("strGenre") private String strGenre;
    @SerializedName("strLabel") private Object strLabel;
    @SerializedName("strReleaseFormat") private String strReleaseFormat;
    @SerializedName("intSales") private String intSales;
    @SerializedName("strAlbumThumb") private String strAlbumThumb;
    @SerializedName("strAlbumThumbHQ") private Object strAlbumThumbHQ;
    @SerializedName("strAlbumThumbBack") private Object strAlbumThumbBack;
    @SerializedName("strAlbumCDart") private String strAlbumCDart;
    @SerializedName("strAlbumSpine") private Object strAlbumSpine;
    @SerializedName("strAlbum3DCase") private Object strAlbum3DCase;
    @SerializedName("strAlbum3DFlat") private Object strAlbum3DFlat;
    @SerializedName("strAlbum3DFace") private Object strAlbum3DFace;
    @SerializedName("strAlbum3DThumb") private Object strAlbum3DThumb;
    @SerializedName("strDescriptionEN") private String strDescriptionEN;
    @SerializedName("strDescriptionDE") private String strDescriptionDE;
    @SerializedName("strDescriptionFR") private String strDescriptionFR;
    @SerializedName("strDescriptionCN") private Object strDescriptionCN;
    @SerializedName("strDescriptionIT") private Object strDescriptionIT;
    @SerializedName("strDescriptionJP") private Object strDescriptionJP;
    @SerializedName("strDescriptionRU") private Object strDescriptionRU;
    @SerializedName("strDescriptionES") private Object strDescriptionES;
    @SerializedName("strDescriptionPT") private Object strDescriptionPT;
    @SerializedName("strDescriptionSE") private Object strDescriptionSE;
    @SerializedName("strDescriptionNL") private Object strDescriptionNL;
    @SerializedName("strDescriptionHU") private Object strDescriptionHU;
    @SerializedName("strDescriptionNO") private Object strDescriptionNO;
    @SerializedName("strDescriptionIL") private Object strDescriptionIL;
    @SerializedName("strDescriptionPL") private Object strDescriptionPL;
    @SerializedName("intLoved") private Object intLoved;
    @SerializedName("intScore") private Object intScore;
    @SerializedName("intScoreVotes") private Object intScoreVotes;
    @SerializedName("strReview") private String strReview;
    @SerializedName("strMood") private String strMood;
    @SerializedName("strTheme") private Object strTheme;
    @SerializedName("strSpeed") private String strSpeed;
    @SerializedName("strLocation") private Object strLocation;
    @SerializedName("strMusicBrainzID") private String strMusicBrainzID;
    @SerializedName("strMusicBrainzArtistID") private String strMusicBrainzArtistID;
    @SerializedName("strAllMusicID") private Object strAllMusicID;
    @SerializedName("strBBCReviewID") private Object strBBCReviewID;
    @SerializedName("strRateYourMusicID") private Object strRateYourMusicID;
    @SerializedName("strDiscogsID") private Object strDiscogsID;
    @SerializedName("strWikidataID") private Object strWikidataID;
    @SerializedName("strWikipediaID") private Object strWikipediaID;
    @SerializedName("strGeniusID") private Object strGeniusID;
    @SerializedName("strLyricWikiID") private Object strLyricWikiID;
    @SerializedName("strMusicMozID") private Object strMusicMozID;
    @SerializedName("strItunesID") private Object strItunesID;
    @SerializedName("strAmazonID") private Object strAmazonID;
    @SerializedName("strLocked") private String strLocked;

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public Object getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(Object idLabel) {
        this.idLabel = idLabel;
    }

    public String getStrAlbum() {
        return strAlbum;
    }

    public void setStrAlbum(String strAlbum) {
        this.strAlbum = strAlbum;
    }

    public String getStrAlbumStripped() {
        return strAlbumStripped;
    }

    public void setStrAlbumStripped(String strAlbumStripped) {
        this.strAlbumStripped = strAlbumStripped;
    }

    public String getStrArtist() {
        return strArtist;
    }

    public void setStrArtist(String strArtist) {
        this.strArtist = strArtist;
    }

    public String getStrArtistStripped() {
        return strArtistStripped;
    }

    public void setStrArtistStripped(String strArtistStripped) {
        this.strArtistStripped = strArtistStripped;
    }

    public String getIntYearReleased() {
        return intYearReleased;
    }

    public void setIntYearReleased(String intYearReleased) {
        this.intYearReleased = intYearReleased;
    }

    public String getStrStyle() {
        return strStyle;
    }

    public void setStrStyle(String strStyle) {
        this.strStyle = strStyle;
    }

    public String getStrGenre() {
        return strGenre;
    }

    public void setStrGenre(String strGenre) {
        this.strGenre = strGenre;
    }

    public Object getStrLabel() {
        return strLabel;
    }

    public void setStrLabel(Object strLabel) {
        this.strLabel = strLabel;
    }

    public String getStrReleaseFormat() {
        return strReleaseFormat;
    }

    public void setStrReleaseFormat(String strReleaseFormat) {
        this.strReleaseFormat = strReleaseFormat;
    }

    public String getIntSales() {
        return intSales;
    }

    public void setIntSales(String intSales) {
        this.intSales = intSales;
    }

    public String getStrAlbumThumb() {
        return strAlbumThumb;
    }

    public void setStrAlbumThumb(String strAlbumThumb) {
        this.strAlbumThumb = strAlbumThumb;
    }

    public Object getStrAlbumThumbHQ() {
        return strAlbumThumbHQ;
    }

    public void setStrAlbumThumbHQ(Object strAlbumThumbHQ) {
        this.strAlbumThumbHQ = strAlbumThumbHQ;
    }

    public Object getStrAlbumThumbBack() {
        return strAlbumThumbBack;
    }

    public void setStrAlbumThumbBack(Object strAlbumThumbBack) {
        this.strAlbumThumbBack = strAlbumThumbBack;
    }

    public String getStrAlbumCDart() {
        return strAlbumCDart;
    }

    public void setStrAlbumCDart(String strAlbumCDart) {
        this.strAlbumCDart = strAlbumCDart;
    }

    public Object getStrAlbumSpine() {
        return strAlbumSpine;
    }

    public void setStrAlbumSpine(Object strAlbumSpine) {
        this.strAlbumSpine = strAlbumSpine;
    }

    public Object getStrAlbum3DCase() {
        return strAlbum3DCase;
    }

    public void setStrAlbum3DCase(Object strAlbum3DCase) {
        this.strAlbum3DCase = strAlbum3DCase;
    }

    public Object getStrAlbum3DFlat() {
        return strAlbum3DFlat;
    }

    public void setStrAlbum3DFlat(Object strAlbum3DFlat) {
        this.strAlbum3DFlat = strAlbum3DFlat;
    }

    public Object getStrAlbum3DFace() {
        return strAlbum3DFace;
    }

    public void setStrAlbum3DFace(Object strAlbum3DFace) {
        this.strAlbum3DFace = strAlbum3DFace;
    }

    public Object getStrAlbum3DThumb() {
        return strAlbum3DThumb;
    }

    public void setStrAlbum3DThumb(Object strAlbum3DThumb) {
        this.strAlbum3DThumb = strAlbum3DThumb;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public String getStrDescriptionDE() {
        return strDescriptionDE;
    }

    public void setStrDescriptionDE(String strDescriptionDE) {
        this.strDescriptionDE = strDescriptionDE;
    }

    public String getStrDescriptionFR() {
        return strDescriptionFR;
    }

    public void setStrDescriptionFR(String strDescriptionFR) {
        this.strDescriptionFR = strDescriptionFR;
    }

    public Object getStrDescriptionCN() {
        return strDescriptionCN;
    }

    public void setStrDescriptionCN(Object strDescriptionCN) {
        this.strDescriptionCN = strDescriptionCN;
    }

    public Object getStrDescriptionIT() {
        return strDescriptionIT;
    }

    public void setStrDescriptionIT(Object strDescriptionIT) {
        this.strDescriptionIT = strDescriptionIT;
    }

    public Object getStrDescriptionJP() {
        return strDescriptionJP;
    }

    public void setStrDescriptionJP(Object strDescriptionJP) {
        this.strDescriptionJP = strDescriptionJP;
    }

    public Object getStrDescriptionRU() {
        return strDescriptionRU;
    }

    public void setStrDescriptionRU(Object strDescriptionRU) {
        this.strDescriptionRU = strDescriptionRU;
    }

    public Object getStrDescriptionES() {
        return strDescriptionES;
    }

    public void setStrDescriptionES(Object strDescriptionES) {
        this.strDescriptionES = strDescriptionES;
    }

    public Object getStrDescriptionPT() {
        return strDescriptionPT;
    }

    public void setStrDescriptionPT(Object strDescriptionPT) {
        this.strDescriptionPT = strDescriptionPT;
    }

    public Object getStrDescriptionSE() {
        return strDescriptionSE;
    }

    public void setStrDescriptionSE(Object strDescriptionSE) {
        this.strDescriptionSE = strDescriptionSE;
    }

    public Object getStrDescriptionNL() {
        return strDescriptionNL;
    }

    public void setStrDescriptionNL(Object strDescriptionNL) {
        this.strDescriptionNL = strDescriptionNL;
    }

    public Object getStrDescriptionHU() {
        return strDescriptionHU;
    }

    public void setStrDescriptionHU(Object strDescriptionHU) {
        this.strDescriptionHU = strDescriptionHU;
    }

    public Object getStrDescriptionNO() {
        return strDescriptionNO;
    }

    public void setStrDescriptionNO(Object strDescriptionNO) {
        this.strDescriptionNO = strDescriptionNO;
    }

    public Object getStrDescriptionIL() {
        return strDescriptionIL;
    }

    public void setStrDescriptionIL(Object strDescriptionIL) {
        this.strDescriptionIL = strDescriptionIL;
    }

    public Object getStrDescriptionPL() {
        return strDescriptionPL;
    }

    public void setStrDescriptionPL(Object strDescriptionPL) {
        this.strDescriptionPL = strDescriptionPL;
    }

    public Object getIntLoved() {
        return intLoved;
    }

    public void setIntLoved(Object intLoved) {
        this.intLoved = intLoved;
    }

    public Object getIntScore() {
        return intScore;
    }

    public void setIntScore(Object intScore) {
        this.intScore = intScore;
    }

    public Object getIntScoreVotes() {
        return intScoreVotes;
    }

    public void setIntScoreVotes(Object intScoreVotes) {
        this.intScoreVotes = intScoreVotes;
    }

    public String getStrReview() {
        return strReview;
    }

    public void setStrReview(String strReview) {
        this.strReview = strReview;
    }

    public String getStrMood() {
        return strMood;
    }

    public void setStrMood(String strMood) {
        this.strMood = strMood;
    }

    public Object getStrTheme() {
        return strTheme;
    }

    public void setStrTheme(Object strTheme) {
        this.strTheme = strTheme;
    }

    public String getStrSpeed() {
        return strSpeed;
    }

    public void setStrSpeed(String strSpeed) {
        this.strSpeed = strSpeed;
    }

    public Object getStrLocation() {
        return strLocation;
    }

    public void setStrLocation(Object strLocation) {
        this.strLocation = strLocation;
    }

    public String getStrMusicBrainzID() {
        return strMusicBrainzID;
    }

    public void setStrMusicBrainzID(String strMusicBrainzID) {
        this.strMusicBrainzID = strMusicBrainzID;
    }

    public String getStrMusicBrainzArtistID() {
        return strMusicBrainzArtistID;
    }

    public void setStrMusicBrainzArtistID(String strMusicBrainzArtistID) {
        this.strMusicBrainzArtistID = strMusicBrainzArtistID;
    }

    public Object getStrAllMusicID() {
        return strAllMusicID;
    }

    public void setStrAllMusicID(Object strAllMusicID) {
        this.strAllMusicID = strAllMusicID;
    }

    public Object getStrBBCReviewID() {
        return strBBCReviewID;
    }

    public void setStrBBCReviewID(Object strBBCReviewID) {
        this.strBBCReviewID = strBBCReviewID;
    }

    public Object getStrRateYourMusicID() {
        return strRateYourMusicID;
    }

    public void setStrRateYourMusicID(Object strRateYourMusicID) {
        this.strRateYourMusicID = strRateYourMusicID;
    }

    public Object getStrDiscogsID() {
        return strDiscogsID;
    }

    public void setStrDiscogsID(Object strDiscogsID) {
        this.strDiscogsID = strDiscogsID;
    }

    public Object getStrWikidataID() {
        return strWikidataID;
    }

    public void setStrWikidataID(Object strWikidataID) {
        this.strWikidataID = strWikidataID;
    }

    public Object getStrWikipediaID() {
        return strWikipediaID;
    }

    public void setStrWikipediaID(Object strWikipediaID) {
        this.strWikipediaID = strWikipediaID;
    }

    public Object getStrGeniusID() {
        return strGeniusID;
    }

    public void setStrGeniusID(Object strGeniusID) {
        this.strGeniusID = strGeniusID;
    }

    public Object getStrLyricWikiID() {
        return strLyricWikiID;
    }

    public void setStrLyricWikiID(Object strLyricWikiID) {
        this.strLyricWikiID = strLyricWikiID;
    }

    public Object getStrMusicMozID() {
        return strMusicMozID;
    }

    public void setStrMusicMozID(Object strMusicMozID) {
        this.strMusicMozID = strMusicMozID;
    }

    public Object getStrItunesID() {
        return strItunesID;
    }

    public void setStrItunesID(Object strItunesID) {
        this.strItunesID = strItunesID;
    }

    public Object getStrAmazonID() {
        return strAmazonID;
    }

    public void setStrAmazonID(Object strAmazonID) {
        this.strAmazonID = strAmazonID;
    }

    public String getStrLocked() {
        return strLocked;
    }

    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }

}