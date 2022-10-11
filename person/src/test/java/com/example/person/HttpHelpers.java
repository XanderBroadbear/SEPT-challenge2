package com.example.person;


import java.io.StringWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpHelpers {
    public static HttpResponse JSONPost(String postEndpoint, String json)
            throws Exception
    {



        var request = HttpRequest.newBuilder()
                .uri(URI.create(postEndpoint))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        var client = HttpClient.newHttpClient();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response;

        //System.out.println(response.statusCode());
        //System.out.println(response.body());

    }
    static public HttpResponse get(String url)
            throws Exception
    {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        var client = HttpClient.newHttpClient();
        return  client.send(request, HttpResponse.BodyHandlers.ofString());

    }
}
