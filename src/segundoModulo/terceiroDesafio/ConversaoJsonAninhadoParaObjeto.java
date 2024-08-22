/*
Crie uma classe Livro que contenha atributos como título, autor e um objeto
representando a editora. Em seguida, implemente um programa que utiliza a biblioteca Gson
para converter um JSON aninhado representando um livro em um objeto do tipo Livro.
 */

package segundoModulo.terceiroDesafio;

import com.google.gson.Gson;

public class ConversaoJsonAninhadoParaObjeto {

    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\"" +
                ",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        terceiroModulo.terceiroDesafio.Livro livro = gson.fromJson(jsonLivro, terceiroModulo.terceiroDesafio.Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }
}
