// perimetro é 2pir
package engtelecom.poo;

/**
 * Circulo
 */
public class Circulo extends Forma2D{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    /**
     * Retorna a área do círculo
     * Área do círculo é pi * r²
     */
    @Override
    public double getArea() {
        return Math.PI * this.getRaio() * this.getRaio();
    }

    /**
     * Retorna o perímetro do círculo
     * Perimetro do círculo é 2 pi r
     */
    @Override
    public double getPerimetro() {
        return (2.0 * Math.PI * this.getRaio());
    }




    


    

    

    

    
}