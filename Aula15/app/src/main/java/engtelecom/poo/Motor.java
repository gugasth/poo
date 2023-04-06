package engtelecom.poo;

public class Motor {

    private int rpm;
    private final int RPM_MAX;

    public Motor (int RPM_MAX){
        this.rpm = 0;
        this.RPM_MAX = RPM_MAX;
    }

    public int acelerar(int intensidade){
        this.rpm+=intensidade;
        return this.rpm;
    }

    
}
