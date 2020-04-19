package Deezer;

import Supporting.ParserMain;


public class ParserDeezer extends ParserMain {
    String title;
    String albumName;
    String artistName;
    String coverUrl;

    ParserDeezer(String title, String albumName, String artistName, String coverUrl) {
        this.title = title;
        this.albumName = albumName;
        this.artistName = artistName;
        this.coverUrl = coverUrl;
    }

}
