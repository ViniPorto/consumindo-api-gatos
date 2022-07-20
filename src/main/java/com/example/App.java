package com.example;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception{

        GetJsonFromAPI api_consumer = new GetJsonFromAPI();
        String body = api_consumer.getJsonFromAPI("https://api.thecatapi.com/v1/images/search");

        Gson gson = new Gson();
        Gato gato[] = gson.fromJson(body, Gato[].class);
        
        GeradorDeImagem gerador = new GeradorDeImagem();
        gerador.gerarImagem(gato[0]);
    }
}
