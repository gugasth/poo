package engtelecom.agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contatos = new ArrayList<>();

    public boolean adicionar(Pessoa p){
        return this.contatos.add(p);
    }

    

    public String listaDeContatos(){
        StringBuilder sb = new StringBuilder();

        this.contatos.forEach(p->sb.append(p+"\n"));

        return sb.toString();
    }



    public Pessoa getContato(String nome) {
        for (Pessoa pessoa : contatos) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                return pessoa;
            }
        }
        return null;
    }
}
