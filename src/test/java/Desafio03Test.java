import org.junit.jupiter.api.Test;

import static dev.leanderson.Desafio03.verMaiorAndMenor;
import static org.junit.jupiter.api.Assertions.*;

class Desafio03Test {

    @Test
    void deveRetornarMaiorEMenor() {
        int[] numeros = {1, 3, 55, 6};

        int[] resultado = verMaiorAndMenor(numeros);

        assertNotNull(resultado);
        assertEquals(55, resultado[0]); // maior
        assertEquals(1, resultado[1]);  // menor
    }

    @Test
    void deveFuncionarComUmUnicoElemento() {
        int[] numeros = {10};

        int[] resultado = verMaiorAndMenor(numeros);

        assertNotNull(resultado);
        assertEquals(10, resultado[0]);
        assertEquals(10, resultado[1]);
    }

    @Test
    void deveRetornarNullQuandoArrayVazio() {
        int[] numeros = {};

        int[] resultado = verMaiorAndMenor(numeros);

        assertNull(resultado);
    }

    @Test
    void deveFuncionarComNumerosNegativos() {
        int[] numeros = {-10, -3, -50, -1};

        int[] resultado = verMaiorAndMenor(numeros);

        assertNotNull(resultado);
        assertEquals(-1, resultado[0]);   // maior
        assertEquals(-50, resultado[1]);  // menor
    }
}
