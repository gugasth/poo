package engtelecom.agenda;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.xml.crypto.Data;

public class Pessoa {
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

    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return this.nome + " " + this.sobrenome + "\n" + DataNascimento.format(formato);
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
