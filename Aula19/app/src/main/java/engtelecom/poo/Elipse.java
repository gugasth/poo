package engtelecom.poo;

/**
 * Elipse
 */
public class Elipse extends Forma2D{
    private double eixoX;
    private double eixoY;

    //***************************
    // Métodos getters e setters
    //*************************** 
    public double getEixoX() {
        return eixoX;
    }
    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }
    public double getEixoY() {
        return eixoY;
    }
    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }

    /**
     * Calcula o perimetro da elipse
     * o perímetro é dado por A * B * 2 * PI
     * @return o perimetro
     */
    public double getPerimetro(){
        //TOFIX x n é A e y n é B
        return getEixoX() * getEixoY() * 2 * Math.PI;
    }

    /**
     * Calcula a área da elipse
     * a área é dada por PI * A * B
     * @return a área
     */
    public double getArea(){
        //TOFIX também
        return Math.PI * getEixoX() * getEixoY();
    }
}