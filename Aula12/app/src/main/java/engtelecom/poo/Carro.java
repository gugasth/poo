package engtelecom.poo;

public class Carro {

    // sendo static compartilha o mesmo atributo em todas as instâncias do objeto
    private static int contador = 0;
    private String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
        this.contador++;
    }

    @Override
    public String toString() {
        return "Carro [contador=" + contador + ", modelo=" + modelo + "]";
    }
    
}
