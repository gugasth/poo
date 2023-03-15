package engtelecom.poo;

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas < 24 && horas >=0){
            this.horas = horas;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 60 && minutos >=0 ){
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 60 && segundos >=0 ){
            this.segundos = segundos;
        }
    }

    @Override
    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }


    public Tempo(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public Tempo(int horas, int minutos) {
        setHoras(horas);
        setMinutos(minutos);
    }

    public Tempo(int horas) {
        setSegundos(horas);
    }

    public long convertePraSegundos(){
        long segundos = 0;

         segundos += this.horas * 60 * 60;
         segundos += this.minutos*60;
         segundos += this.segundos;

        return segundos;
    }

    // retorna diferença em segundos de um pro outro
    public long diferenca(Tempo a, Tempo b){
        long aConvertido=0;


        return aConvertido;

    }


}
