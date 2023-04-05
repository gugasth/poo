package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TermometroTest {

    @Test
    public void testaGetCelsius(){
        Termometro tA = new Termometro(30, -459, 373, 'C');
        assertEquals(30, tA.getCelsius());

        Termometro tB = new Termometro(30, -459, 373, 'F');
        assertEquals(-1, tB.getCelsius());

        Termometro tC = new Termometro(30, -459, 373, 'K');
        assertEquals(-243, tC.getCelsius());
    }



    @Test
    public void testaGetFahrenheit(){
        Termometro tA = new Termometro(30, -459, 373, 'C');
        assertEquals(86, tA.getFahrenheit());

        Termometro tB = new Termometro(30, -459, 373, 'F');
        assertEquals(30, tB.getFahrenheit());

        Termometro tC = new Termometro(30, -459, 373, 'K');
        assertEquals(373, tC.getFahrenheit());
    }

    @Test
    public void testaGetKelvin(){
        Termometro tA = new Termometro(30, -459, 373, 'C');
        assertEquals(303, tA.getKelvin());

        Termometro tB = new Termometro(30, -459, 373, 'F');
        assertEquals(272, tB.getKelvin());

        Termometro tC = new Termometro(30, -459, 373, 'K');
        assertEquals(30, tC.getKelvin());
    }
    

    @Test
    public void testaDiferenca(){
        Termometro tA = new Termometro(50, -459, 373, 'C');
        Termometro tB = new Termometro(20, -459, 373, 'C');
        assertEquals(30, tA.diferenca(tB, 'C'));
        assertEquals(86, tA.diferenca(tB, 'F'));
        assertEquals(303, tA.diferenca(tB, 'K'));

        Termometro tC = new Termometro(-100, -459, 373, 'F');
        Termometro tD = new Termometro(-200, -459, 373, 'F');
        assertEquals(100, tC.diferenca(tD, 'F'));
        assertEquals(38, tC.diferenca(tD, 'C'));
        assertEquals(311, tC.diferenca(tD, 'K'));

        Termometro tE = new Termometro(214, -459, 373, 'K');
        Termometro tF = new Termometro(114, -459, 373, 'K');
        assertEquals(100, tE.diferenca(tF, 'K'));
        assertEquals(-173, tE.diferenca(tF, 'C'));
        assertEquals(-280, tE.diferenca(tF, 'F'));

        Termometro tG = new Termometro(25, -459, 373, 'C');
        Termometro tH = new Termometro(50, -459, 373, 'F'); //50°F é 10°C
        assertEquals(15, tG.diferenca(tH, 'C'));
        assertEquals(59, tG.diferenca(tH, 'F'));
        assertEquals(288, tG.diferenca(tH, 'K'));

        Termometro tI = new Termometro(57, -459, 373, 'F');
        Termometro tJ = new Termometro(276, -459, 373, 'K');
        assertEquals(20, tI.diferenca(tJ, 'F'));
        assertEquals(-7, tI.diferenca(tJ, 'C'));
        assertEquals(266, tI.diferenca(tJ, 'K'));

        Termometro tK = new Termometro(300, -459, 373, 'K');
        Termometro tL = new Termometro(20, -459, 373, 'C');
        assertEquals(7, tK.diferenca(tL, 'K'));
        assertEquals(-266, tK.diferenca(tL, 'C'));
        assertEquals(-447, tK.diferenca(tL, 'F'));
    }
}