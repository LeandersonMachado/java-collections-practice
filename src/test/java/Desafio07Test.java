import dev.leanderson.Desafio07;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Desafio07Test {

    @Test
    void deveConverterArrayParaListaPreservandoValores() {
        String[] entrada = {"Pedro", "Ana", "Paula", "Carlos"};

        List<String> resultado = Desafio07.convertToList(entrada);

        assertEquals(List.of("Pedro", "Ana", "Paula", "Carlos"), resultado);
    }

    @Test
    void devePreservarOrdemOriginalDoArray() {
        String[] entrada = {"A", "B", "C"};

        List<String> resultado = Desafio07.convertToList(entrada);

        assertEquals("A", resultado.get(0));
        assertEquals("B", resultado.get(1));
        assertEquals("C", resultado.get(2));
    }

    @Test
    void deveRetornarListaVaziaQuandoArrayForVazio() {
        String[] entrada = {};

        List<String> resultado = Desafio07.convertToList(entrada);

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveRetornarListaVaziaQuandoArrayForNull() {
        List<String> resultado = Desafio07.convertToList(null);

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }
}
