package api.theaudiodb;

import api.theaudiodb.dto.AlbumResponse;
import api.theaudiodb.dto.TrackResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiTheAudioDb {
    @GET("album.php")
    Call<AlbumResponse> getAlbum(@Query("m") int id);

    @GET("searchtrack.php") Call<TrackResponse> getTrack(
            @Query("s") String artistName,
            @Query("t") String singleName
    );
}
