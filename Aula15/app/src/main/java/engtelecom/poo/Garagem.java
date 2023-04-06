package engtelecom.poo;

import java.util.ArrayList;

public class Garagem {
    private ArrayList<Carro> vagas = new ArrayList<>();
    private ArrayList<Motor> balcao = new ArrayList<>();


    public boolean adicionaCarro(Carro c){
        vagas.add(c);
        return true;
    }

    public boolean removeCarro(Carro c){
        if (!vagas.isEmpty()){
            vagas.remove(c);
            return true;
        } else {
            return false;
        }
    }
    public boolean adicionaMotor(){
        return true;
    }
    public boolean removeMotor(int rpm){
        if (!balcao.isEmpty()){
            balcao.remove(rpm);
            return true;
        } else {
            return false;
        }
    }




}


