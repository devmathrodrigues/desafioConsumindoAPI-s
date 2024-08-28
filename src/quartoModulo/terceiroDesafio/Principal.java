package quartoModulo.terceiroDesafio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Wolkswagem", "Jetta", 2024, 0.32);

        // Criação de um objeto Gson com formatação "Pretty"
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Serialização do objeto Veiculo para JSON formatado
        String veiculoJson = gson.toJson(veiculo);

        System.out.println(veiculoJson);
    }
}