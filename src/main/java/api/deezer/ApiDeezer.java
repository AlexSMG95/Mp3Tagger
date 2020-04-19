package api.deezer;

import api.deezer.dto.AlbumDto;
import api.deezer.dto.SearchResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiDeezer {
    @GET("search") public Call<SearchResponse> search(@Query("q") String query);

    @GET("album/{id}") public Call<AlbumDto> getAlbum(@Path("id") int id);
}
