/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

public class App {


    public static void main(String[] args) {
        Aluno gustavo = new Aluno();

        gustavo.setNome("Gustavo lindo");
        gustavo.setMatricula(123);
        gustavo.setEmail("gustavo.p07@aluno.ifsc.edu.br");


        System.out.println("nome: " + gustavo.getNome());
        System.out.println("matricula: " + gustavo.getMatricula());
        System.out.println("email: " + gustavo.getEmail());

        Aluno b = new Aluno();

        b.setNome(" pessoa");
        b.setMatricula(1223);
        b.setEmail("pessoa@hotmail.com");


        System.out.println("nome: " + b.getNome());
        System.out.println("matricula: " + b.getMatricula());
        System.out.println("email: " + b.getEmail());


        Aluno c = new Aluno("jose", 3213 ,"jose@gmail.com");

        System.out.println("nome: " + c.getNome());
        System.out.println("matricula: " + c.getMatricula());
        System.out.println("email: " + c.getEmail());

        


    }
}
