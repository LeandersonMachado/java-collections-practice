import org.junit.jupiter.api.Test;

import java.util.List;

import static dev.leanderson.Desafio04.filtrarPorTamanho;
import static org.junit.jupiter.api.Assertions.*;

class Desafio04Test {

    @Test
    void deveFiltrarNomesComMaisDeQuatroCaracteres() {
        List<String> nomes = List.of("Luke", "Ana", "Daniel", "Ruan", "Rodrigo");

        List<String> resultado = filtrarPorTamanho(nomes);

        assertEquals(2, resultado.size());
        assertTrue(resultado.contains("Daniel"));
        assertTrue(resultado.contains("Rodrigo"));
    }

    @Test
    void deveRetornarListaVaziaQuandoNenhumNomeAtendeAoFiltro() {
        List<String> nomes = List.of("Ana", "Leo", "Ruan");

        List<String> resultado = filtrarPorTamanho(nomes);

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveRetornarListaVaziaQuandoListaForVazia() {
        List<String> resultado = filtrarPorTamanho(List.of());

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }

    @Test
    void deveRetornarListaVaziaQuandoListaForNula() {
        List<String> resultado = filtrarPorTamanho(null);

        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }
}
