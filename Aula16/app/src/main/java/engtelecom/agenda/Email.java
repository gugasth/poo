package engtelecom.agenda;

/**
 * Classe email
 */
public class Email {
    private String valor;
    private String rotulo;


    /**
     * Construtor do email
     * @param rotulo do email
     * @param valor do email
     */
    public Email(String valor, String rotulo) {
        this.valor = valor;
        this.rotulo = rotulo;
    }

    /**
     * Método toString: concatena o valor e o rótulo do email e imprime isso
     */
    public String toString(){
        return this.rotulo + this.valor;
    }

    /**
     * Método que verifica se o email é válido
     * @return true se o email for válido e false caso o emáil seja inválido
     */
    public boolean isValido(){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return toString().matches(eR);
    }

    
}
