package engtelecom.poo;

/**
 * Classe que realiza algumas operações aritméticas
 * @version 1.0.0
 * @author Gustavo Paulo
 * @since 1.0.0
 */
public class Calculadora{


    /**
     * Método que soma dois inteiros
     * @param a primeiro operando
     * @param b segundo operando    
     * @return soma dos operandos
     */
    public int soma (int a, int b){
        int resultado = a + b;
        return resultado;
        }

    /**
     * Verifica o tipo de triangulo com base nos parametros informados.
     * @param a
     * @param b
     * @param c
     * @return "equilátero", "escaleno", "isósceles" ou "não é um triângulo"
     */
    public String tipoTriangulo(int a, int b, int c){

        // Não é um triangulo
        if (a <= 0 || b <= 0 || c <= 0){
            return "não é";
        }
        if (a == b && a*2 <= c){
            return "não é";
        }
        if (a == c && a*2 <= b){
            return "não é";
        }
        if (b == c && b*2 <= a){
            return "não é";
        }

        // Equilátero
        if (a == b && a == c && b == c){
            return "equilátero";
        }

        // Escaleno
        if (a != b && a != c && b != c){
            return "escaleno";
        }

        // Isósceles
        if (a < b && b == c){
            return "isósceles";
        }
        if (b < a && a == c){
            return "isósceles";
        }
        if (c < a && a == b){
            return "isósceles";
        }

        return"";
    }
}