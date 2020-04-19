import Supporting.GetFileList;
import Supporting.TagSetter;
import api.ApiClient;
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
//
//        for (int i = 0; i < GetFileList.listWithFileNames.size(); i++) {
//            File mp3 = new File(String.valueOf(GetFileList.listWithFileNames.get(i)));
//            try {
//                Gson gson = new GsonBuilder().create();
//                RequestTrack responseTrack = new RequestTrack();
//                RequestAlbum responseAlbum = new RequestAlbum();
//                TrackResponse rootTrack = gson.fromJson(responseTrack.Request(getFile.getArtistName(i)
//                                                    , getFile.getTrackName(i))
//                                                    , TrackResponse.class);
//                AlbumResponse rootAlbum = gson.fromJson(responseAlbum.Request(rootTrack.getTrack().get(0).getIdAlbum())
//                                                    , AlbumResponse.class);
//                TagSetter.setTag(mp3
//                                , rootTrack.getTrack().get(0).getStrTrack()
//                                , rootTrack.getTrack().get(0).getStrArtist()
//                                , rootTrack.getTrack().get(0).getStrAlbum()
//                                , rootAlbum.getAlbum().get(0).getStrAlbumThumb()
//                                , getFile.getPath() + rootAlbum.getAlbum().get(0).getStrAlbum() + ".jpg");
//            } catch (NullPointerException e) {
//                getFile.unTaggetFileName(mp3);
//            } catch (FileNotFoundException e) {
//                getFile.unTaggetFileArt(mp3);
//            } catch (Exception e){
//                e.printStackTrace();
//            }
//        }

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

                //TODO Так делать сука плохо!!!
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


//        GetFileList getFileList = new GetFileList(GetFileList.listWithFileNamesUnTaggetName);
//        for (int i = 0; i < GetFileList.listWithFileNames.size(); i++)
//        {
//            File mp3 = new File(String.valueOf(GetFileList.listWithFileNames.get(i)));
//
//            Gson gson = new GsonBuilder().create();
//
//            try {
//
//                TagSetter.setTag(mp3, rootDeezer.getData().get(0).getTitle()
//                        , rootDeezer.getData().get(0).getArtist().getName(), rootDeezer.getData().get(0).getAlbum().getTitle(), rootDeezer.getData().get(0).getAlbum().getCover_medium()
//                        , getFile.getPath() + rootDeezer.getData().get(0).getAlbum().getTitle() + ".jpg");
//            } catch (FileNotFoundException e) {
//                continue;
//            } catch (NullPointerException e) {
//                continue;
//            }
//        }
        System.out.println(GetFileList.listWithFileNamesUnTaggetName);
    }
}

