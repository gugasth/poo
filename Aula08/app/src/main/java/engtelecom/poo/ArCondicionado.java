package engtelecom.poo;

public class ArCondicionado{

    private final int MINIMO = 16;
    private final int MAXIMO = 30;

    // Atributos
    private boolean estado = false;
    private int temperaturaDesejada;


    // Métodos

/**
 * Obtém o estado do ar condicionado
 */
    public boolean getEstado(){
        return estado;
}


/**
 * Liga o ar se ele estiver desligado, e desliga se ele estiver ligado
 */
    public void setEstado(){
        estado = !estado;
}




/**
 * Define a temperatura do ar condicionado
 */
    public int setTemperaturaDesejada(int novaTemperatura){
        temperaturaDesejada = (novaTemperatura >= MINIMO && novaTemperatura <= MAXIMO)? novaTemperatura: temperaturaDesejada;
        return temperaturaDesejada;
}
} // fim da classe