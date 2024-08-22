/*
Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a
exceção SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada
caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).
 */

package terceiroModulo.segundoDesafio;

import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe sua senha: ");
            String senha = scanner.nextLine();

            //Valida a senha
            validarSenha(senha);

            System.out.println("Senha válida.");
        } catch (SenhaInvalidaException e) {
            //Captura e trata a exceção personalizada
            System.out.println("Erro: " + e.getMessage());
        } finally {
            //Fecha o scanner
            scanner.close();
        }
    }

    //Método para validar a senha
    public static void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
