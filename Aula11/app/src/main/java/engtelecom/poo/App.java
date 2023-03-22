package engtelecom.poo;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class App {


    public static void main(String[] args) throws Exception {
         Barra a = new Barra(20, WHITE, '.', RED, '#');
         boolean x = false;
         a.iniciar(x);


        // Exemplo do professor
        /*  
        AnsiConsole.systemInstall();
        System.out.print(ansi().reset().eraseScreen().cursor(1,1));
        System.out.print(ansi().fg(BLUE).a("[--------------------]"));
        // System.out.println(ansi().fg(RED).a("G").fg(GREEN).a("u").fg(YELLOW).a("s").fg(BLUE).a("t").fg(MAGENTA).a("a").fg(CYAN).a("v").fg(RED).a("o"));

        for (int i=2; i<22; i++){
            
            System.out.print(ansi().reset().cursor(1,i).fg(RED).a("#"));
            
            Thread.sleep(100); // dormindo 100ms
        }

        System.out.println();
        AnsiConsole.systemUninstall();
        */
    }
}
