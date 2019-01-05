package com.jiawa.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * java11 study second for http client
 *
 * @author panguanjing
 * @date 2019-01-05
 */
public class Second {
    public static void main(String[] args) throws IOException, InterruptedException {
        String uri = "http://www.baidu.com";

        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
            .uri(URI.create(uri))
            .build();
        HttpResponse<String> response =
            client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}