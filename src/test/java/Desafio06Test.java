import org.junit.jupiter.api.Test;

import java.util.List;

import static dev.leanderson.Desafio06.removerDuplicatas;
import static org.junit.jupiter.api.Assertions.*;

class Desafio06Test {

    @Test
    void deveRemoverDuplicatasPreservandoOrdem() {
        List<Integer> numeros = List.of(1, 2, 3, 1, 3);

        List<Integer> resultado = removerDuplicatas(numeros);

        assertEquals(List.of(1, 2, 3), resultado);
    }

    @Test
    void deveRetornarListaIgualQuandoNaoHouverDuplicatas() {
        List<Integer> numeros = List.of(1, 2, 3, 4);

        List<Integer> resultado = removerDuplicatas(numeros);

        assertEquals(List.of(1, 2, 3, 4), resultado);
    }

    @Test
    void deveRetornarListaVaziaQuandoListaForVazia() {
        List<Integer> resultado = removerDuplicatas(List.of());

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveRetornarListaVaziaQuandoListaForNula() {
        List<Integer> resultado = removerDuplicatas(null);

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveFuncionarComNumerosNegativos() {
        List<Integer> numeros = List.of(-1, -2, -1, -3, -2);

        List<Integer> resultado = removerDuplicatas(numeros);

        assertEquals(List.of(-1, -2, -3), resultado);
    }
}
