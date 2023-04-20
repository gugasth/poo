package engtelecom.agenda;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.xml.crypto.Data;

public class Pessoa {
    private int codigo = 0;
    private String nome;
    private String sobrenome;
    private LocalDate DataNascimento;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;


    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.DataNascimento = dataNascimento;
    }

    

    /**
     * Método que gera o código para a pessoa
     * @param codigo a ser criado
     */
    public void geraCodigo(int codigo) {
        this.codigo = codigo + 1;
    }



    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return this.codigo + " - " + this.nome + " " + this.sobrenome + " " + DataNascimento.format(formato) + "\n";
    }

    public int getCodigo() {
        return codigo;
    }

    /**
     * Método que instancia um email e adiciona ele ao array list de emails
     * @param valor do email a ser adicionado
     * @param rotulo do email a ser adicionado
     */
    public void adicionaEmail(String valor, String rotulo){
        Email m = new Email(rotulo, valor);
        emails.add(m);
    }


    /**
     * Método que instancia um email e adiciona ele ao array list de emails
     * @param valor do email a ser adicionado
     * @param rotulo do email a ser adicionado
     */
    public void adicionaTelefone(String valor, String rotulo){
        Telefone t = new Telefone(rotulo, valor);
        telefones.add(t);
    }

    public String getNome() {
        return nome;
    }
    
}
