/*
Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes
HttpClient, HttpRequeste HttpResponse. Solicite ao usuário que insira uma letra de uma
receita e exiba as informações disponíveis sobre essas receitas.
*/

package terceiroDesafio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaReceitaTheMealDB {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a primeira letra da receita para a busca: ");
        var primeiraLetraDaReceita = leitura.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?f=" + primeiraLetraDaReceita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
