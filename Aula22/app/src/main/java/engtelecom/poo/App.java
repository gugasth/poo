package engtelecom.poo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    ArrayList<Pessoa> agenda = new ArrayList<>();

    public void salvar(){
        File arquivo = new File("agenda.dat");
        try(FileOutputStream fos = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ){
            oos.writeObject(this.agenda);
        } catch (Exception e){
            System.err.println(e);
        }
    }

    public void lerDoDisco(){
        File arquivo = new File("agenda.dat");
        try (
        FileInputStream fin = new FileInputStream(arquivo);
        ObjectInputStream oin = new ObjectInputStream(fin);
        ){
        // Lendo os objetos de um arquivo (typecast inseguro)
        this.agenda = (ArrayList<Pessoa>) oin.readObject();
        // Percorrendo o ArrayList e imprimindo detalhes de cada pessoa
        this.agenda.forEach(System.out::println);
        
         } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
            }
        }

    public static void main(String[] args) {
        App p = new App();
        //p.agenda.add(new Pessoa("joao", "123"));
        //p.agenda.add(new Pessoa("maria", "456"));

        //p.salvar();
        p.lerDoDisco();
    }
}

        /*
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
    */
   