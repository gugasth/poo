package engtelecom.poo;

public class Carro {
        // Atributos
        private String modelo;
        private int velocidadeAtual;

        // Métodos
        public void definirModelo(String m){
                modelo = m;
        }

        public void definirVelocidadeAtual(int v){
                velocidadeAtual = v;
        }

        public String obterModelo(){
                return modelo;
        }

        public int obterVelocidadeAtual(){
                return velocidadeAtual;
        }
        
} // fim da classe