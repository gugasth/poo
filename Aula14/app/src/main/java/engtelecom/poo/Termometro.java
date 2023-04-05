package engtelecom.poo;

public class Termometro {
    private int temperaturaAtual;
    private int temperaturaMinima;
    private int temperaturaMaxima;
    private char escala;

    // Construtor
    public Termometro(int temperaturaAtual, int temperaturaMinima, int temperaturaMaxima, char escala) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;

        // Se a escala não for válida, então será Celsius por padrão.
        if (escala == 'C' || escala == 'F' || escala == 'K'){
            this.escala = escala;
        } else {
            this.escala =  'C';
        }
    }


    public int getCelsius(){
        if (this.escala == 'C'){
            
        } 
        else if (this.escala == 'F'){

        }
        else if (this.escala == 'K'){

        }
        return -1;
    }

    public int getFahrenheit(){
        return -1;
    }

    public int getKelvin(){
        return -1;
    }

    /**
     * Retorna a diferença de temperatura na escala informada
     * @param t objeto da classe Termometro
     * @param escala termométrica
     * @return a diferença
     */
    public int diferenca(Termometro t, char escala){
        if(escala == 'C'){
            
        }
        if(escala == 'F'){
            // implementar aqui
        }
        if(escala == 'K'){
            // implementar aqui
        }

        return 0;
    }
}