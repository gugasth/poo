package engtelecom.agenda;

import java.util.ArrayList;

/**
 * Classe que representa uma agenda
 */
public class Agenda {
    private ArrayList<Pessoa> contatos = new ArrayList<>();

    /**
     * Método que adiciona pessoa a lista de contatos
     * @param p pessoa a ser adicionada
     * @return boolean que representa se a pessoa foi adicionada com êxito ou não
     */
    public boolean adicionar(Pessoa p){
        p.geraCodigo(contatos.size());
        return this.contatos.add(p);
    }


    /**
     * Exibe a lista de contatos da agenda em ordem númerica crescente
     */
    public String listaDeContatos(String listaContatos){
        for(Pessoa pessoa: contatos){
            listaContatos += pessoa.toString();
        }
        return listaContatos;
    }

    /**
     * Método que remove a pessoa cujo código é recebido como parâmetro do método
     * @param p codigo da pessoa a ser removida
     */
    public void removePessoa(int codigo){
        for (Pessoa pessoa: contatos){
            contatos.removeIf(contatos->pessoa.equals(codigo));
        }
    }

}
