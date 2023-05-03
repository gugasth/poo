package engtelecom.poo.Robos;

public class RoboL5 extends RoboL3{
    private int z;

    public RoboL5(String nome, int x, int y, int z, char direcao, int bateria) {
        super(nome, x, y, direcao, bateria);
        this.z = z;
    }


    /**
     * Obtém a coordenada z
     * @return
     */
    public int getZ() {
        return z;
    }

    /**
     * Altera a coordenada z do robô
     * @param z é a nova coordenadaZ a ser atribuída ao robô 
     */
    public int setAltitude(int z) {
        this.z = z;
        return z;
    }

    /**
     * Método que retorna a coordenada atual na forma de string
     * @return (x,y,z)
     */
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }


    @Override
    public char giraRobo(char sentido) {
        return 0;
    }


    @Override
    public boolean equals(Object obj) {
        if( super.equals(obj)){
            RoboL5 r = (RoboL5)obj;

            if (this.z == r.z){
                return true;
            }
        }
        return false;
    }

}
