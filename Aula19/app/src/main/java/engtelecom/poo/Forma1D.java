package engtelecom.poo;

/**
 * Forma1D
 */
public class Forma1D {
    protected String corDaLinha;
    protected Ponto inicial;



    public String getCorDaLinha() {
        return corDaLinha;
    }
    public void setCorDaLinha(String corDaLinha) {
        this.corDaLinha = corDaLinha;
    }
    public Ponto getInicial() {
        return inicial;
    }
    public void setInicial(Ponto inicial) {
        this.inicial = inicial;
    }



    /**
     * Retorna o perímetro
     * @return
     */
    public double getPerimetro(){
        return 1;
    }

    /**
     * "Desenha" a forma
     * @return
     */
    public String desenhar(){
        return "Desenhando";
    }
}