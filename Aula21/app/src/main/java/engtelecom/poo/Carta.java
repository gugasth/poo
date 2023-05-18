package engtelecom.poo;

public class Carta {
    private Naipe naipe;
    private Valor valor;

    /**
     * Construtor principal da classe Carta
     * @param naipe da carta
     * @param valor da carta
     */
    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }
}