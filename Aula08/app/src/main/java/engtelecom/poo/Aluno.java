package engtelecom.poo;

public class Aluno {
    // Atributos
    private String nome;
    private int Matricula;
    private String email;

   
    public Aluno(){

    }


   public Aluno(String nome, int matricula, String email) {
        this.nome = nome;
        this.Matricula = matricula;
        this.email = email;
    }

/**
    * Obtem o nome do aluno
    * @return
    */
    public String getNome(){
        return nome;
    }

    /**
     * Substitui o nome do aluno pelo novo nome dado pelo parametro.
     * @param novoNome
     */
    public void setNome(String novoNome){
        nome = novoNome;
    }


    /**
     * Obtem o valor da matricula do aluno
     * @return
     */
    public int getMatricula(){
        return Matricula;
    }

    /**
     * Substitui a matrícula do aluno pela matrícula dada por parametro
     * @param novaMatricula
     */
    public void setMatricula(int novaMatricula){
        this.Matricula = novaMatricula;
    }

    /**
     * Obtem o email do aluno
     * @return
     */
    public String getEmail(){
        return email;
    }

    /**
     * Substitui o email do aluno pelo novo email dado por parametro
     * @param novoEmail
     */
    public void setEmail(String novoEmail){
        email = novoEmail;
    }
}


