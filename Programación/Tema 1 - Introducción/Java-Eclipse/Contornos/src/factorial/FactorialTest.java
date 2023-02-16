package factorial;

import static org.junit.Assert.*;

import org.junit.Test;

import factorial.Factorial;

public class FactorialTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testFactorialBucle1() throws Exception {
        Factorial factorial = new Factorial();
        int resultado = factorial.factorial_bucle(0);
        int resEsperado = 1;
        assertEquals(resultado, resEsperado);
    }

    @Test
    public void factorialBucleExpectedException() {
        Factorial factorial = new Factorial();
        try {
            factorial.factorial_bucle(Integer.MIN_VALUE);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void factorialBucleUnexpectedException() {
        Factorial factorial = new Factorial();

        try {
            factorial.factorial_bucle(Integer.MAX_VALUE);
        } catch (Exception e) {
            fail("Unexpected exception was thrown");
        }
    }

    @Test
    public void factorialRecursivoUnexpectedException() {
        Factorial factorial = new Factorial();

        try {
            factorial.factorial_recursivo(Integer.MAX_VALUE);
        } catch (Exception e) {
            fail("Unexpected exception was thrown");
        }
    }

}