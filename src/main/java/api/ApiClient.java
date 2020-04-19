package api;

import api.deezer.ApiDeezer;
import api.theaudiodb.ApiTheAudioDb;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private final static OkHttpClient client = new OkHttpClient
            .Builder()
            //.addInterceptor()
            .build();
//            .addHeader("x-rapidapi-host", "deezerdevs-deezer.p.rapidapi.com")
//            .addHeader("x-rapidapi-key", "b73a9146dcmshb911597d909a091p12e882jsnf27a31953b60")

    private final static Retrofit retrofit = new Retrofit
            .Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static final ApiDeezer apiDeezer = retrofit.create(ApiDeezer.class);
    public static final ApiTheAudioDb apiTheAudioDb = retrofit.create(ApiTheAudioDb.class);
}
