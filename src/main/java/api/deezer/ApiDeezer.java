package api.deezer;

import api.deezer.dto.AlbumDto;
import api.deezer.dto.SearchResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiDeezer {
    final static String DEEZER_ENDPOINT = "https://deezerdevs-deezer.p.rapidapi.com/";

    @GET(DEEZER_ENDPOINT + "search") public Call<SearchResponse> search(@Query("q") String query);

    @GET(DEEZER_ENDPOINT + "album/{id}") public Call<AlbumDto> getAlbum(@Path("id") int id);
}
