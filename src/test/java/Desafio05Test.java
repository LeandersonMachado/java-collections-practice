import org.junit.jupiter.api.Test;

import java.util.List;

import static dev.leanderson.Desafio05.filtrarPares;
import static org.junit.jupiter.api.Assertions.*;

class Desafio05Test {

    @Test
    void deveRetornarApenasNumerosPares() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> resultado = filtrarPares(numeros);

        assertEquals(List.of(2, 4, 6), resultado);
    }

    @Test
    void deveRetornarListaVaziaQuandoNaoHouverPares() {
        List<Integer> numeros = List.of(1, 3, 5, 7);

        List<Integer> resultado = filtrarPares(numeros);

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveRetornarListaVaziaQuandoListaForVazia() {
        List<Integer> resultado = filtrarPares(List.of());

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveRetornarListaVaziaQuandoListaForNula() {
        List<Integer> resultado = filtrarPares(null);

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveFuncionarComNumerosNegativos() {
        List<Integer> numeros = List.of(-4, -3, -2, -1, 0, 1);

        List<Integer> resultado = filtrarPares(numeros);

        assertEquals(List.of(-4, -2, 0), resultado);
    }
}
