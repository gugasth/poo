package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculadoraTest {

    @Test
    public void testarEquilatero(){
        Calculadora c = new Calculadora();
        assertEquals("equilátero", c.tipoTriangulo(5,5,5));
    }

    @Test
    public void testarEscaleno(){
        Calculadora c = new Calculadora();
        assertEquals("escaleno", c.tipoTriangulo(3, 4, 5));
    }

    @Test
    public void testarIsosceles(){
        Calculadora c = new Calculadora();
        assertEquals("isósceles", c.tipoTriangulo(3, 4, 4));
        assertEquals("isósceles", c.tipoTriangulo(4, 3, 4));
        assertEquals("isósceles", c.tipoTriangulo(4, 4, 3));
    }

    @Test
    public void TestarNaoTriangulo(){
        Calculadora c = new Calculadora();
        assertEquals("não é", c.tipoTriangulo(0, 0, 0));
        assertEquals("não é", c.tipoTriangulo(3, 3, 6));
        assertEquals("não é", c.tipoTriangulo(3, 6, 3));
        assertEquals("não é", c.tipoTriangulo(6, 3, 3));

        assertEquals("não é", c.tipoTriangulo(-3, 4, 5));
        assertEquals("não é", c.tipoTriangulo(3, -4, 5));
        assertEquals("não é", c.tipoTriangulo(3, 4, -5));


    }

}
