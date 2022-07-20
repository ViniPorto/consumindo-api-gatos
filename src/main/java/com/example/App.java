package com.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        String url = "https://api.thecatapi.com/v1/images/search";
        URI endereco = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        Gson gson = new Gson();
        Gato gato[] = gson.fromJson(body, Gato[].class);
        
        GeradorDeImagem gerador = new GeradorDeImagem();

        gerador.gerarImagem(gato[0]);
    }
}
