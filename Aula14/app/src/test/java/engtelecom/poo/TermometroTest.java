package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TermometroTest {

    @Test
    public void testaGetCelsius(){
        Termometro tA = new Termometro(30, -50, 273, "C");
        assertEquals(30, tA.getCelsius());

        Termometro tB = new Termometro(30, -50, 273, "F");
        assertEquals(-1, tB.getCelsius());

        Termometro tC = new Termometro(30, -50, 273, "K");
        assertEquals(-243, tC.getCelsius());
    }

    @Test
    public void testaGetFahrenheit(){
        Termometro tA = new Termometro(30, -50, 273, "C");
        assertEquals(86, tA.getFahrenheit());

        Termometro tB = new Termometro(30, -50, 273, "F");
        assertEquals(30, tB.getFahrenheit());

        Termometro tC = new Termometro(30, -50, 273, "K");
        assertEquals(273, tC.getFahrenheit());
    }

    @Test
    public void testaGetKelvin(){
        Termometro tA = new Termometro(30, -50, 273, "C");
        assertEquals(303, tA.getKelvin());

        Termometro tB = new Termometro(30, -50, 273, "F");
        assertEquals(272, tB.getKelvin());

        Termometro tC = new Termometro(30, -50, 273, "K");
        assertEquals(30, tC.getKelvin());
    }
    

    @Test
    public void testaDiferenca(){
        Termometro tA = new Termometro(2, -50, 273, "C");
        Termometro tB = new Termometro(2, -50, 273, "C");


    }




}
