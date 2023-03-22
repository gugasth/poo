package engtelecom.poo;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

import org.fusesource.jansi.Ansi.Color;

public class Barra {
    // Atributos

    private int tamanhoBarra;
    private Color corDimensao;
    private char charDimensao;
    private Color corProgresso;
    private char charProgresso;
   


    /**
     * Construtor
     * @param tamanhoBarra
     * @param corDimensao
     * @param charDimensao
     * @param corProgresso
     * @param charProgresso
     */

    public Barra(int tamanhoBarra, Color corDimensao, char charDimensao, Color corProgresso, char charProgresso) {
        if (tamanhoBarra >= 20 && tamanhoBarra <= 100){
            this.tamanhoBarra = tamanhoBarra;
            this.corDimensao = corDimensao;
            this.charDimensao = charDimensao;
            this.corProgresso = corProgresso;
            this.charProgresso = charProgresso;
        } 
    }

    /**
     * Método que cria e preenche a barra de progresso conforme os atributos da classe Barra
     * @throws Exception
     */
    public void iniciar(boolean porcentagem) throws Exception{
        AnsiConsole.systemInstall();
        // Preenche a dimensão
        System.out.print(ansi().reset().eraseScreen().cursor(1,1));
        for (int i=1; i<tamanhoBarra+1; i++){
            System.out.print(ansi().fg(this.corDimensao).a(this.charDimensao));
        }

        for (int i=0; i<this.tamanhoBarra+1; i++){
            System.out.print(ansi().reset().cursor(1,i).fg(this.corProgresso).a(this.charProgresso));
            Thread.sleep(100);
            if (porcentagem == true){
                int tamanho = this.tamanhoBarra - i;
                for (int j=0; j<tamanho; j++){
                    System.out.print(" ");
                }
                // se o usuário deseja a porcentagem, então:
                
                // mostra com porcentagem
                System.out.print(i * 100 / this.tamanhoBarra + "/" + 100);
                
            }
        }
        System.out.println();
        AnsiConsole.systemUninstall();
}
    

/**
 * Método iniciar que mostra o nome do arquivo e usa seu tamanho na iteração.
 * @param tamanhoArquivo
 * @param nomeArquivo
 * @param porcentagem
 * @throws Exception
 */
public void iniciar(String nomeArquivo, int tamanhoArquivo, boolean porcentagem) throws Exception{


    
    AnsiConsole.systemInstall();
 
    


    // Preenche a dimensão

    System.out.print(ansi().fg(RED).a(nomeArquivo + ": "));
    System.out.print(ansi().eraseScreen().cursor(1,1));
    

    for (int i=1; i<tamanhoBarra+1; i++){
        System.out.print(ansi().fg(this.corDimensao).a(this.charDimensao));
    }

    for (int i=0; i<this.tamanhoBarra+1; i++){
        System.out.print(ansi().cursor(1,i).fg(this.corProgresso).a(this.charProgresso));
        Thread.sleep(100);


        if (porcentagem == true){
            int tamanho = this.tamanhoBarra - i;
            for (int j=0; j<tamanho; j++){
                System.out.print(" ");
            }
            // se o usuário deseja a porcentagem, então:
            
            // mostra com porcentagem
            System.out.print(i * 100 / this.tamanhoBarra + "/" + 100);
            
        }
    }
    System.out.println();
    AnsiConsole.systemUninstall();
}

}



    

