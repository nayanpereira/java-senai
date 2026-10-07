package br.com.romulo.curso.http;

import java.net.URI; // URL - WWW.google.com
import java.net.http.HttpClient;  // Cliente (Objeto)
import java.net.http.HttpRequest; // Pedir Uber - Solicitar uma requisição
import java.net.http.HttpResponse; // Resposta, envia a resposta da requisição

public class Algoritmo56 {
    public static void main(String[] args) {
        // Endpoint, ponto de consumo da API - URL da API para buscar as raças dos gatos
        String url = "https://api.thecatapi.com/v1/breeds";
        // Criea objeto cliente - Representa um navegador(chrome/firefox) Criando o cliente HTTP moderno nativo do Java
        HttpClient client = HttpClient.newHttpClient();
        // Cria o objeto request - Construindo a requisição GET, Requisição é o pedido
        // . métodos encadeados
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                // Se tiver uma API Key, descomente a linha abaixo:
                .header("x-api-key",
                        "")
                .GET()
                .build();
        try {
            // Enviando a requisição de forma síncrona
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                System.out.println("Resposta da API:");
                System.out.println(response.body());

                // Dica: Para extrair a URL de forma elegante, você pode usar
                // uma biblioteca como Jackson ou Gson, ou fazer um parsing simples.
            } else {
                System.out.println("Erro na requisição: " +
                        response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
