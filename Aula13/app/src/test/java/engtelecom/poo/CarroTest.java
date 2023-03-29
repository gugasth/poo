package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarroTest {
    
    @Test
    public void testarVelocidadeMaxima(){
        Carro c = new Carro();

      
        assertEquals(10, c.acelera());
        assertEquals(20, c.acelera());
        assertEquals(30, c.acelera());
        assertEquals(40, c.acelera());
        assertEquals(50, c.acelera());
        assertEquals(60, c.acelera());
        assertEquals(70, c.acelera());
        assertEquals(80, c.acelera());
        assertEquals(90, c.acelera());
        assertEquals(100, c.acelera());
        assertEquals(100, c.acelera());
    }

    @Test
    public void testarVelocidadeMaximaComIncremento(){
        Carro c = new Carro();
        assertEquals(10, c.acelera(10));
        assertEquals(100, c.acelera(90));
        assertEquals(100, c.acelera(15));
        assertEquals(100, c.acelera(-15));
    }
}
