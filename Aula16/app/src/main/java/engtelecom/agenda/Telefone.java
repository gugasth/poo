package engtelecom.agenda;

public class Telefone {
    private String rotulo;
    private String valor;


    /**
     * Método toString: concatena o valor e o rótulo do telefone e imprime isso
     */
    public String toString(){
        return "(" + this.rotulo + ")" + this.valor;
    }

    /**
     * Construtor do telefone
     * @param rotulo do telefone
     * @param valor do telefone
     */
    public Telefone(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }

    public boolean isValido(){
        return false;
    }
}
