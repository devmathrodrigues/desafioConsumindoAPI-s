package quintoModulo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaAPIViaCEP consultaAPI = new ConsultaAPIViaCEP();

        // Exibe o menu para o usuário
        System.out.println("Digite o CEP que deseja consultar:");
        String cep = scanner.nextLine();

        // Realiza a consulta e exibe o resultado
        String resultado = consultaAPI.buscarCep(cep);
        System.out.println("Resultado da consulta:");
        System.out.println(resultado);

        // Salva o resultado em um arquivo JSON
        consultaAPI.salvarDadosEmJson(cep, resultado);

        scanner.close();
    }
}

