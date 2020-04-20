package api;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

class Headerinterceptor implements Interceptor {

    public Response intercept(Interceptor.Chain chain) throws IOException {

        Request originalRequest = chain.request();
        Request requestWithUserAgent = originalRequest
                .newBuilder()
                .addHeader("x-rapidapi-host", "deezerdevs-deezer.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "b73a9146dcmshb911597d909a091p12e882jsnf27a31953b60")
                .build();

        return chain.proceed(requestWithUserAgent);
    }
}