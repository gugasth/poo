package engtelecom.poo.Robos;

/**
 * Classe que representa um robô de exploração espacial
 */
public class RoboL3 {

    /**
     * Nome do robô
     */
    private String nome;

    /**
     * Coordenada x do plano cartesiano
     */
    private int x;

    /**
     * Coordenada y do plano cartesiano
     */
    private int y;

    /**
     * Direção para onde o robô está olhando
     */
    private char direcao;

    /**
     * Indicador de bateria do robô
     */
    private int bateria;

    /**
     * Origem do plano cartesiano (0,0)
     */
    private final int ORIGEM = 0;

    /**
     * Indicador mínimo de bateria
     */
    private final int BATERIAMIN= 0;

    /**
     * Indicador máximo de bateria
     */
    private final int BATERIAMAX = 30;

    /**
     * Valor default de bateria, para caso seja inserido um valor inválido
     */
    private final int BATERIADEFAULT = 10;

    /**
     * Construtor padrão
     * @param nome do robô
     * @param x coordenada horizontal do plano cartesiano
     * @param y coordenada vertical do plano cartesiano
     * @param direcao pra onde o robô está olhando
     * @param bateria indicador inteiro de bateria do robô
     */
    public RoboL3(String nome, int x, int y, char direcao, int bateria) {
        this.nome = nome;

        // Se ambas as coordenadas são válidas,
        if (x > ORIGEM && y > ORIGEM){
            // Então ok
            this.x = x;
            this.y = y;
        } else {
            // Senão atribui as coordenadas 0 para ambas
            this.x = ORIGEM;
            this.y = ORIGEM;
        }

        // Se a direção for válida,
        if (direcao == 'N' || direcao == 'S' || direcao == 'L' || direcao == 'O'){
            // Então ok
            this.direcao = direcao;
        } else {
            // Senão atribui a direção Norte (robô inicia olhando pra cima).
            this.direcao = 'N';
        }
        // Se a bateria está dentro dos limiares estabelecidos no escopo do projeto,
        if (bateria >= BATERIAMIN && bateria <= BATERIAMAX){
            // Então ok.
            this.bateria = bateria;
        } else {
            // Senão, atribui o valor default 10.
            this.bateria = BATERIADEFAULT;
        }
    }

    /**
     * Método que retorna a coordenada atual na forma de string
     * @return (x,y)
     */
    public String getCoordenadas() {
        return "(" + this.x + "," + this.y + ")";
    }

    /**
     * Método que retorna a coordenada atual na forma de string
     * @return (x,y)
     */
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    /**
     * Método que retorna a direção à frente do robô
     * @return um caracter que indica a direção que o robô está olhando, pode ser: 'S', 'N', 'L' ou 'O'.
     */
    public char getDirecao() {
        return direcao;
    }


    /**
     * Método que gira o robô em seu próprio eixo
     * @param sentido a ser girado, pode ser 'E' ou 'D' (esquerda ou direita).
     * @return a nova direção a qual o robô está olhando.
     */
    public char giraRobo(char sentido){
        // Verifica se tem bateria
        if (bateria > BATERIAMIN){
            // Girando para a esquerda:
            if (sentido == 'E'){
                bateria--;
                if (this.direcao == 'N') {
                    this.direcao = 'O';
                } else if(this.direcao == 'O'){
                    this.direcao = 'S';
                } else if (this.direcao == 'S'){
                    this.direcao = 'L';
                } else if (this.direcao == 'L'){
                    this.direcao = 'N';
                }
            // Girando para a direita:
            } else if(sentido == 'D'){
                bateria--;
                if (this.direcao == 'N') {
                    this.direcao = 'L';
                } else if(this.direcao == 'L'){
                    this.direcao = 'S';
                } else if (this.direcao == 'S'){
                    this.direcao = 'O';
                } else if (this.direcao == 'O'){
                    this.direcao = 'N';
                }
            } else {
                System.out.println("Direção inválida");
            }
        }
            // Mostra a direção a qual o robô está apontando
            return this.direcao;
    }

    /**
     * Método que desloca z unidades para a frente do robô, por exemplo:
     * se o robô está nas coordenadas (0,10) virado pro norte e z for igual a 10,
     * então o robô irá para (0,30). O método só realiza o deslocamento e retorna true
     *  caso o robô tenha bateria. Caso contrário, retorna false
     * @param z unidades para a frente para o robô ser deslocado
     * @return true caso o deslocamento ocorra com sucesso e false caso não ocorra.
     */
    public boolean deslocaUnidades(int z){
        if (this.bateria > z && z > 0){
            if (this.direcao == 'N'){
                this.y += z;
            } else if (this.direcao == 'S'){
                this.y -= z;
            } else if (this.direcao == 'L'){
                this.x += z;
            } else if (this.direcao == 'O'){
                this.x -= z;
            }
        } else {
            return false;
        }
        this.bateria -= z;
        return true;
    }

    /**
     * Método que retorna a quantidade total de movimentos que o robô
     * ainda será capaz de realizar antes que sua bateria acabe
     * (ou seja, sua bateria restante).
     * @return o indicador de bateria
     */
    public int movimentosRestantes() {
        return this.bateria;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
}
