package engtelecom.poo;

public enum Combustivel {
    
    // INSTANCIAS da classe combustível
    ETANOL(1.0), GASOLINA(1.2), FLEX(1.1);

    public final double eficiencia;

    Combustivel(double e){
        this.eficiencia = e;
    }
}