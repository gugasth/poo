package engtelecom.poo;

public class Pessoa {
    // Atributos
    private long id;
    private String cpf;
    private String nome;

    // método construtor
    public Pessoa(long id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    
    public void setCpf(String cpf) {
        // TODO: verificar se é válido, se for, então:
        this.cpf = cpf;
    }

    public String getCpf() {
        // TODO: formatar o cpf pra incluir a máscara 3d.3d.3d-2d
        return cpf;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString() {
        return "Id: " + id + "\nNome: " + nome + "\nCPF: " + cpf;
    }
}

    



