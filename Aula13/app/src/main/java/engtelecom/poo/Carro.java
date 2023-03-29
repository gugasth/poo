package engtelecom.poo;



/**
 * Classe que representa um carro em um jogo, onde tem uma velocidade limitada em 100 km/hr
 * Tem uma aceleração de 10km/hr por chamada de método
 * Tem um freio de 10km/hr por chamada de método
 */
public class Carro {

    // Velocidade mínima que o carro pode ter
    private final int velocidadeMinima = 0;

    // Velocidade máxima que o carro pode atingir
    private final int velocidadeMaxima = 100;

    // Quantidade de aceleração padrão em km/h do carro
    private final int quantAceleracao = 10;

    // Quantidade de freio padrão em km/h do carro
    private final int quantFreio = 10;

    // Inteiro que representa a velocidade atual do carro
    private int velocidadeAtual;

    /**
     * Método que acelera o carro em 10 unidades
     */
    public int acelera(){
        // se a velocidade estiver entre 0 e 100
        if (this.velocidadeAtual < velocidadeMaxima && this.velocidadeAtual >= 0){
            // se a velocidade estiver entre 90 e 100, então vai pra 100
            if (this.velocidadeAtual >= velocidadeMaxima - quantAceleracao){
                this.velocidadeAtual = velocidadeMaxima;
            } else {
                // senão aumenta 10 de velocidade
                this.velocidadeAtual = this.velocidadeAtual + quantAceleracao;
            }
        }
        return this.velocidadeAtual;
    }

    /**
     * Método que acelera o carro em na unidade fornecida por parametro
     */
    public int acelera(int incremento){
        // se a velocidade estiver entre 0 e 100
        if (this.velocidadeAtual < velocidadeMaxima && this.velocidadeAtual >= 0){
            // se for possível incrementar
            if (this.velocidadeAtual >= velocidadeMaxima - incremento){
                this.velocidadeAtual = velocidadeMaxima;
            } else {
                // senão faz o incremento
                this.velocidadeAtual = this.velocidadeAtual + incremento;
            }
        }
        return this.velocidadeAtual;
    }

    /**
     * Método que obtêm a velocidade atual do carro
     * @return a velocidade atual do carro
     */
    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    /**
     * Método que freia o carro
     */
    public int freia(){
        if (this.velocidadeAtual > velocidadeMinima){
            // se a velocidade estiver entre 0 e 10, então o freio vai estacionar o carro
            if(this.velocidadeAtual <= quantFreio){
                this.velocidadeAtual = 0;
            } else {
                // senão a velocidade é reduzida em 10 unidades
                this.velocidadeAtual = this.velocidadeAtual - quantFreio;
            }
        }
        return velocidadeAtual;
    }

    
}
