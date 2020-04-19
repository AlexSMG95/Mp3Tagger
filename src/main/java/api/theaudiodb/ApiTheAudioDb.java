package api.theaudiodb;

import api.theaudiodb.dto.AlbumResponse;
import api.theaudiodb.dto.TrackResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiTheDb {
    final static String ENDPOINT = "https://www.theaudiodb.com/api/v1/json/1/";

    @GET(ENDPOINT + "album.php")
    Call<AlbumResponse> getAlbum(@Query("m") int id);

    @GET(ENDPOINT + "searchtrack.php") Call<TrackResponse> getTrack(
            @Query("s") String artistName,
            @Query("t") String singleName
    );
}
