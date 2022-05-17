package Test;

import Clases.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void Calculadora() {
        Calculadora calculadora=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});
        assertEquals(calculadora, new Calculadora("calculadora1", new int[]{1, 15, 60, 1, 55, 2}));
    }

    @org.junit.jupiter.api.Test
    void multiplicarPositivos() throws Exception {
        Calculadora calculadora=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});
        calculadora.multiplicar(2);
        assertArrayEquals(new int[]{2, 30, 120, 2, 110, 4}, calculadora.numeros,"no es correcta la prueba");
    }

    @org.junit.jupiter.api.Test
    void multiplicarNegativos() throws Exception {
        Calculadora calculadora=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});
        calculadora.multiplicar(-2);
        assertArrayEquals(new int[]{-2, -30, -120, -2, -110, -4}, calculadora.numeros,"no es correcta la prueba");
    }

    @org.junit.jupiter.api.Test
    void multiplicarExcepcion() {
        boolean exceptionProducida = false;
        try {
            Calculadora calculadora = new Calculadora(null,new int[0]);
            calculadora.multiplicar(0);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");
    }

    @org.junit.jupiter.api.Test
    void multiplicarPorCero() throws Exception {
        Calculadora calculadora=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});
        calculadora.multiplicar(0);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, calculadora.numeros,"no es correcta la prueba");
    }


    @org.junit.jupiter.api.Test
    void numeroRepeticionesSeRepite() throws Exception {
        Calculadora calculadora=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});
        assertEquals(2,calculadora.numeroRepeticiones(1), "La prueba no es correcta" );
    }

    @org.junit.jupiter.api.Test
    void numeroRepeticionesNoSeRepite() throws Exception {
        Calculadora calculadora=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});
        assertEquals(0,calculadora.numeroRepeticiones(103), "La prueba no es correcta" );
    }
    @org.junit.jupiter.api.Test
    void numeroRepeticionesVectorNulo() {

        boolean exceptionProducida = false;
        try {
            Calculadora calculadora=new Calculadora(null, null);
            calculadora.numeroRepeticiones(0);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");
    }


    @org.junit.jupiter.api.Test
    void testEqualsSonIguales() {
        Calculadora calculadora1=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});
        Calculadora calculadora2=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});

       assertEquals(calculadora1.equals(calculadora2),calculadora2.equals(calculadora1), "los objetos no son iguales");

       //Probar assertTue
    }

    @org.junit.jupiter.api.Test
    void testEqualsNoSonIguales() {
        Calculadora calculadora1=new Calculadora("calculadora1",new int[]{1, 15, 60, 1, 55, 2});
        Calculadora calculadora2=new Calculadora("calculadora1",new int[]{1, 30, 60, 1, 55, 2});

        assertNotEquals(calculadora1.equals(calculadora2),calculadora2, "los objetos no son iguales");

        //probar assertfalse
    }
}