import Supporting.GetFileList;
import Supporting.TagSetter;
import api.ApiClient;
import api.deezer.dto.SearchResponse;
import api.theaudiodb.dto.AlbumResponse;
import api.theaudiodb.dto.TrackResponse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        GetFileList getFile = new GetFileList(path);
        for (int i = 0; i < GetFileList.listWithFileNames.size(); i++) {
            File mp3 = new File(String.valueOf(GetFileList.listWithFileNames.get(i)));

            try {
                String fileArtistName = getFile.getArtistName(i);
                String fileTrackName = getFile.getTrackName(i);
                String trackName;
                String artistName;
                String albumName;
                String albumPicture;
                String albumPicturePath;

                TrackResponse trackResponse = ApiClient
                        .apiTheAudioDb
                        .getTrack(fileArtistName, fileTrackName)
                        .execute()
                        .body();


                int albumId = trackResponse.getTrack().get(0).getIdAlbum();
                AlbumResponse albumResponse = ApiClient
                        .apiTheAudioDb
                        .getAlbum(albumId)
                        .execute()
                        .body();

                trackName = trackResponse.getTrack().get(0).getStrTrack();
                artistName = trackResponse.getTrack().get(0).getStrArtist();
                albumName = trackResponse.getTrack().get(0).getStrAlbum();
                albumPicture = albumResponse.getAlbum().get(0).getStrAlbumThumb();
                albumPicturePath = getFile.getPath() + albumResponse.getAlbum().get(0).getStrAlbum() + ".jpg";

                TagSetter.setTag(mp3, trackName, artistName, albumName, albumPicture, albumPicturePath);

            } catch (NullPointerException e) {
                getFile.unTaggetFileName(mp3);
            } catch (FileNotFoundException e) {
                getFile.unTaggetFileArt(mp3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(GetFileList.listWithFileNamesUnTaggetName);
        getFile = new GetFileList(GetFileList.listWithFileNamesUnTaggetName, path);

        for (int i = 0; i < GetFileList.listWithFileNames.size(); i++) {
            File mp3 = new File(String.valueOf(GetFileList.listWithFileNames.get(i)));

            try {
                String trackName;
                String artistName;
                String albumName;
                String albumPicture;
                String albumPicturePath;

                SearchResponse searchResponse = ApiClient
                        .apiDeezer
                        .search(getFile.getFileName(i).replaceAll(".mp3", ""))
                        .execute()
                        .body();
                System.out.println(getFile.getFileName(i).replaceAll(".mp3", ""));

                if (searchResponse.getTotal() == 0) {getFile.unTaggetFileName(mp3); continue;}

                trackName = searchResponse.getData().get(0).getTitle();
                artistName = searchResponse.getData().get(0).getArtist().getName();
                albumName = searchResponse.getData().get(0).getAlbum().getTitle();
                albumPicture = searchResponse.getData().get(0).getAlbum().getCover_medium();
                albumPicturePath = getFile.getPath() + searchResponse.getData().get(0).getAlbum().getTitle() + ".jpg";

                TagSetter.setTag(mp3, trackName, artistName, albumName, albumPicture, albumPicturePath);

            } catch (NullPointerException e) {
                getFile.unTaggetFileName(mp3);
            } catch (FileNotFoundException e) {
                getFile.unTaggetFileArt(mp3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(GetFileList.listWithFileNamesUnTaggetName);
        System.out.println(GetFileList.listWithFileNamesUnTaggetName.size());
    }
}

