package engtelecom.poo;

public class Carro{
    private String modelo;
    private Motor propulsor;
    private int velocidade;

    public Carro(String modelo, Motor propulsor){
        this.modelo = modelo;
        this.propulsor = propulsor;
        this.velocidade = 0;
    }

    public int acelerar(int intensidade){
        int rpm = this.propulsor.acelerar(intensidade);
        this.velocidade = 1 + rpm * 10;
        return this.velocidade;
    }

    public void setPropulsor(Motor propulsor){
        this.propulsor = propulsor;
    }
}