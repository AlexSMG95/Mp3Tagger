package api;

import api.deezer.ApiDeezer;
import api.theaudiodb.ApiTheAudioDb;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class ApiClient {
    final static String DEEZER_ENDPOINT = "https://deezerdevs-deezer.p.rapidapi.com/";
    final static String THE_AUDIO_DB_ENDPOINT = "https://www.theaudiodb.com/api/v1/json/1/";


    //TODO добавить interceptor для добавления хедеров
    private final static OkHttpClient client = new OkHttpClient
            .Builder()
            .writeTimeout(100, TimeUnit.MILLISECONDS)
            .addInterceptor(new Headerinterceptor())
            .build();

    private final static Retrofit.Builder retrofitBuilder = new Retrofit
            .Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create());

    public static final ApiDeezer apiDeezer = createApi(DEEZER_ENDPOINT, ApiDeezer.class);
    public static final ApiTheAudioDb apiTheAudioDb = createApi(THE_AUDIO_DB_ENDPOINT, ApiTheAudioDb.class);

    //TODO сорян, гугли generics
    private static <T> T createApi(String endpoint, Class<T> service) {
        return retrofitBuilder.baseUrl(endpoint).build().create(service);
    }
}
