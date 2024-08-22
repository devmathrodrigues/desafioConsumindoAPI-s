/*
Crie um programa simples que solicita dois números ao usuário e realiza a divisão
do primeiro pelo segundo. Utilize o bloco try/catch para tratar a exceção que
pode ocorrer caso o usuário informe 0 como divisor.
 */

package terceiroModulo.primeiroDesafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoComTratamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe o número a ser dividido: ");
            double num1 = scanner.nextDouble();

            System.out.print("Informe o divisor usado: ");
            double num2 = scanner.nextDouble();

            //Realiza a divisão
            double resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (InputMismatchException e) {
            //Tratamento de exceção caso o usuário insira algo que não seja um número
            System.out.println("Erro: Você deve inserir um número válido.");
        } catch (ArithmeticException e) {
            //Tratamento de exceção caso o divisor seja 0
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            //Tratamento de outras exceções genéricas
            System.out.println("Erro: Ocorreu um erro inesperado.");
        } finally {
            //Fecha o scanner
            scanner.close();
        }
    }
}
