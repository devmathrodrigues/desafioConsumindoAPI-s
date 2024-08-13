/*
Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome,
idade e cidade. Em seguida, implemente um programa que utiliza a biblioteca Gson para
converter um JSON representando uma pessoa em um objeto do tipo Pessoa.
 */

package segundoModulo.primeiroDesafio;

import com.google.gson.Gson;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Felipe\",\"idade\":25,\"cidade\":\"São José dos Campos\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto pessoa: " + pessoa);
    }
}
