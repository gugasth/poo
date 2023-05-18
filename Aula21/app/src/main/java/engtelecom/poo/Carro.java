package engtelecom.poo;

public class Carro {

    private String modelo;
    private int velocidadeAtual;
    private Cor cor;
    
    // gasolina, etanol, diesel, flex, elétricos, gnv
    private Combustivel combustivel;

    public Carro(String modelo, Combustivel combustivel, Cor cor){
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.velocidadeAtual = 0;
        this.cor = cor;
    }

    /**
     * Obtém o consumo do carro com base no seu tipo de combustível
     * @return
     */
    public double getConsumo(Planetas planeta){
        double eficiencia = this.combustivel.eficiencia;
        return planeta.posicao * eficiencia;

    }
}
