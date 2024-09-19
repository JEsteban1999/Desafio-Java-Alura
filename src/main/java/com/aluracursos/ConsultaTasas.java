package com.aluracursos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import com.google.gson.Gson;

public class ConsultaTasas {
    public Tasa buscarTasa(String sigla) {
        String apiKey = "4c58f25fb186a945e76305ce";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + sigla);
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            RespuestaAPI respuestaAPI = new Gson().fromJson(response.body(), RespuestaAPI.class);
            Map<String, Double> conversionRates = respuestaAPI.conversion_rates();
            return new Tasa(conversionRates.get("USD"), conversionRates.get("COP"), conversionRates.get("EUR"));
        } catch (Exception e) {
            throw new RuntimeException("Ha ocurrido un error al ejecutar");
        }
    }
}
