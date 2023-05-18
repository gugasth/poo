package engtelecom.poo;

public enum Cor {
    // INSTANCIAS da classe RGB
    RED(1.0), GREEN(2), BLUE(3);

    public double eficiencia;

    Cor(double cor){
        this.eficiencia = cor;
    }
}
