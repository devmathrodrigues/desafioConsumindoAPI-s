/*
1° etapa - Aplicação criada para realizar uma consulta a API ViaCep
2° etapa - Menu construído para o usuário informar o CEP para busca
3° etapa - Geração de um arquivo .JSON com os dados retornado pela API
 */

package quintoModulo;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConsultaAPIViaCEP {

    // Método para buscar o CEP e retornar a resposta como String
    public String buscarCep(String cep) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            //Construção da requisição HTTP do tipo GET para a URL da API ViaCEP
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://viacep.com.br/ws/" + cep + "/json/"))
                    .GET()
                    .build();

            //Envia a requisição e recebe a resposta como uma string
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao realizar a consulta: " + e.getMessage();
        }
    }

    // Método para salvar os dados em um arquivo JSON
    public void salvarDadosEmJson(String cep, String dados) {
        try {
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(dados, JsonObject.class);
            jsonObject.addProperty("cep", cep);

            FileWriter writer = new FileWriter(cep + ".json");
            gson.toJson(jsonObject, writer);
            writer.flush();
            writer.close();

            System.out.println("Dados salvos em " + cep + ".json");
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

