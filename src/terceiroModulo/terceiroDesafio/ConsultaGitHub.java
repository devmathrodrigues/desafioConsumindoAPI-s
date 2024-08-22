/*
Desenvolva um programa em Java que permite aos usuários consultar informações sobre um
usuário do GitHub (utilize a API pública do GitHub para obter os dados). Crie uma classe
de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException.
Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de
forma específica essa exceção, exibindo uma mensagem amigável.
 */

package terceiroModulo.terceiroDesafio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConsultaGitHub {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome de usuário do GitHub: ");
            String nomeUsuario = scanner.nextLine(); //Captura a entrada do usuário e armazenando ela.

            //Chamando o método consultarUsuarioGitHub e passando o nomeUsuário que foi capturado
            //como argumento e então o valor retornado é armazenado dentro da váriavel resultado.
            String resultado = consultarUsuarioGitHub(nomeUsuario);

            System.out.println("Informações do usuário:");
            System.out.println(resultado);
        } catch (ErroConsultaGitHubException e) {
            //Captura e trata a exceção personalizada
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            //Captura e trata outras exceções
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    public static String consultarUsuarioGitHub(String nomeUsuario) {
        String url = "https://api.github.com/users/" + nomeUsuario;
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            //Obtém o código de resposta HTTP
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
                //Mostra a exceção personalizada se o usuário não for encontrado
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
            }

            //Lê a resposta da API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } catch (Exception e) {
            //Trata outras exceções
            throw new RuntimeException("Erro ao consultar a API do GitHub: " + e.getMessage(), e);
        }
    }
}