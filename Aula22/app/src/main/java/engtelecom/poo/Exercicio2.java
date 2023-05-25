package engtelecom.poo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    private Scanner ler = new Scanner(System.in);
    
    /**
     * Método que lê um número inteiro, realizando tratamento de exceções onde obriga o usuário a entrar com um número inteiro.
     * @return o número inteiro digitado
     */
    public int lerNumero(){
        int numero;
        System.out.println("Entre com um número inteiro: ");
        while(true){
            try {
                numero = ler.nextInt();
                System.out.println("Parabéns, você entrou com o " + numero);
                return numero;
            } catch (InputMismatchException e) {
                ler.next();
                System.err.println("Você deve entrar com um número inteiro");
            } catch (Exception e){
                ler.next();
                System.err.println("Ocorreu algum erro, você deve entrar com um número inteiro.");
            }
    }
    }

    /**
     * Método que lê dois números inteiros, realizando tratamento de exceções que obrigam o usuário a realizar uma
     * divisão válida entre dois números inteiros, onde o denominador não pode ser 0.
     * @param a numerador da divisão a ser realizada
     * @param b denominador da divisao a ser realizada
     * @return o quociente da divisão
     */
    public double divisao(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException();
        }
        return (double) a / b;
    }
}
