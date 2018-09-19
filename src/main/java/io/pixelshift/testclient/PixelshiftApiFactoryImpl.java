/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.pixelshift.testclient;

import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.credentials.TokenCredentials;
import com.microsoft.rest.serializer.JacksonAdapter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import pixelshift.PixelshiftApi;
import pixelshift.implementation.PixelshiftApiImpl;

public class PixelshiftApiFactoryImpl implements PixelshiftApiFactory {

    @Override
    public PixelshiftApi getPixelshiftApi(String clientId, String clientSecret, String baseUrl) throws JSONException, IOException {
        RestClient restClient = getRestClient(clientId, clientSecret, baseUrl);
        PixelshiftApi api = new PixelshiftApiImpl(restClient);
        return api;
    }

    private static RestClient getRestClient(
            String clientId,
            String clientSecret,
            String baseUrl) throws JSONException, IOException {

        String token = getAccessToken(clientId, clientSecret, baseUrl);
        TokenCredentials tokenCredentials
                = new TokenCredentials("Bearer", token);
        ServiceResponseBuilder.Factory responseBuilderFactory
                = new ServiceResponseBuilder.Factory();
        JacksonAdapter serializerAdapter = new JacksonAdapter();
        RestClient restClient = buildRestClient(baseUrl, tokenCredentials, responseBuilderFactory, serializerAdapter);
        return restClient;
    }

    private static RestClient buildRestClient(
            String baseUrl,
            TokenCredentials tokenCredentials,
            ServiceResponseBuilder.Factory responseBuilderFactory,
            JacksonAdapter serializerAdapter) {

        RestClient restClient = new RestClient.Builder()
                .withBaseUrl(baseUrl)
                .withCredentials(tokenCredentials)
                .withResponseBuilderFactory(responseBuilderFactory)
                .withSerializerAdapter(serializerAdapter)
                .build();
        return restClient;
    }

    private static String getAccessToken(
            String clientId,
            String clientSecret,
            String baseUrl) throws JSONException, IOException {

        String basicAuthContent = clientId + ":" + clientSecret;
        byte[] bytes = basicAuthContent.getBytes(StandardCharsets.US_ASCII);
        String b64 = Base64.getEncoder().encodeToString(bytes);
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(
                MediaType.parse("application/x-www-form-urlencoded"),
                "grant_type=client_credentials");
        Request request = new Request.Builder()
                .url(baseUrl + "/connect/token")
                .addHeader("Authorization", "Basic " + b64)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        JSONObject jObj = new JSONObject(responseBody);
        String token = jObj.getString("access_token");
        return token;
    }
}
