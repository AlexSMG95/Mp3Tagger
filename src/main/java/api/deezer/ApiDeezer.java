package api;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiDeezer {
    @GET("search") public void search(@Query("q") String query);

    @GET("album/{id}") public void getAlbum(@Path("id") int id);
}
