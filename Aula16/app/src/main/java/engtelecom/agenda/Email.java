package engtelecom.agenda;

/**
 * Classe email
 */
public class Email {
    private String rotulo;
    private String valor;


    /**
     * Construtor do email
     * @param rotulo do email
     * @param valor do email
     */
    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }

    /**
     * Método toString: concatena o valor e o rótulo do email e imprime isso
     */
    public String toString(){
        return this.valor + this.rotulo;
    }

    
}
