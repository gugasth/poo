package engtelecom.poo;

public class Pessoa {
    private String nome;
    private String email;
    
    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", email=" + email + "]";
    }

    
}
