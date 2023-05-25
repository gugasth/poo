package engtelecom.poo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        if (args.length < 1){
            System.err.println("Informe um nome de arquivo");
            System.exit(0);
        }
        String nomeDoArquivo = args[0];
        File arquivo = new File(nomeDoArquivo);

        try (Scanner leitor = new Scanner(arquivo)) {
            int linha = 0;
            while (leitor.hasNext()){
                System.out.println((++linha) + ": " + leitor.nextLine());
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo com problemas " + e);
        } 

        System.out.println("Fim de programa! ");
    }
}
