package engtelecom.poo;

/**
 * Retangulo
 */
public class Retangulo extends Forma2D{
    private Ponto v2;

    public Ponto getV2() {
        return v2;
    }

    public void setV2(Ponto v2) {
        this.v2 = v2;
    }

    /**
     * Obtém a área do retangulo
     * @return a área
     */
    @Override
    public double getArea() {
        return Math.abs(v2.getX() - inicial.getX()) * Math.abs(v2.getY() - inicial.getY()); 
    }

    /**
     * Obtém o perímetro do retangulo
     * @return o perímetro
     * d = base + altura
     * perímetro é 2 * (base + altura)
     */
    @Override
    public double getPerimetro() {
        double d = Math.abs(v2.getX() - inicial.getX()) + Math.abs(v2.getY() - inicial.getY());
        return 2 * d;
    }
}