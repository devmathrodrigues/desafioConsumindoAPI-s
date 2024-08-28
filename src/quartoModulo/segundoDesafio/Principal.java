package quartoModulo.segundoDesafio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        // Criação de um objeto Gson com formatação "Pretty"
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Serialização do objeto Titulo para JSON
        String tituloJson = gson.toJson(titulo);

        System.out.println(tituloJson);
    }
}
