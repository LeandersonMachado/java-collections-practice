import org.junit.jupiter.api.Test;

import static dev.leanderson.Desafio02.somar;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Desafio02Test {

    @Test
    public void deveRetornarSoma() {

        int[] numeros = {2, 4, 4, 5};

        int resultado = somar(numeros);

        assertEquals(15, resultado);
    }

    @Test
    public void deveRetornarZero() {
        int[] numeros = {};
        int resultado = somar(numeros);

        assertEquals(0, resultado);
    }

    @Test void deveRetornarZeroQuandoArrayForNulo() {
        assertEquals(0, somar(null));
    }

}
