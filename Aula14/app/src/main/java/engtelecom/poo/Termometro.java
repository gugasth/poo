package engtelecom.poo;

public class Termometro {
    private int temperaturaAtual;
    private int temperaturaMinima;
    private int temperaturaMaxima;


    // Construtor
    public Termometro(int temperaturaAtual, int temperaturaMinima, int temperaturaMaxima, String escala) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    // Métodos
    public int getCelsius(){
        return -1;
    }

    public int getFahrenheit(){
        return -1;
    }

    public int getKelvin(){
        return -1;
    }

    public int diferenca(Termometro t, String escala){
        return -1;
    }


    
}
