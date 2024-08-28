package quartoModulo.primeiroDesafio;

import java.io.FileWriter;
import java.io.IOException;

public class escrevendoNoArquivo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("arquivo.txt")){
            writer.write("Mensagem a ser gravada no arquivo");
            System.out.println("Sucesso ao gravar a mensagem no arquivo");
        //capturando qualquer problema durante a execução do programa
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar a mensagem");
            //identificando o problema
            e.printStackTrace();
        }
    }
}
