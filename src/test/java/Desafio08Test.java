import dev.leanderson.Desafio08;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Desafio08Test {

    @Test
    void deveContarOcorrenciasIgnorandoMaiusculasMinusculas() {
        List<String> nomes = List.of("Ana", "Pedro", "Paula", "ana");

        int resultado = Desafio08.contarOcorrencias(nomes, "Ana");

        assertEquals(2, resultado);
    }

    @Test
    void deveRetornarZeroQuandoNomeNaoExistirNaLista() {
        List<String> nomes = List.of("Ana", "Pedro", "Paula");

        int resultado = Desafio08.contarOcorrencias(nomes, "Carlos");

        assertEquals(0, resultado);
    }

    @Test
    void deveRetornarZeroQuandoListaForVazia() {
        List<String> nomes = List.of();

        int resultado = Desafio08.contarOcorrencias(nomes, "Ana");

        assertEquals(0, resultado);
    }

    @Test
    void deveRetornarZeroQuandoListaForNull() {
        int resultado = Desafio08.contarOcorrencias(null, "Ana");

        assertEquals(0, resultado);
    }

    @Test
    void deveRetornarZeroQuandoNomeForNull() {
        List<String> nomes = List.of("Ana", "Pedro");

        int resultado = Desafio08.contarOcorrencias(nomes, null);

        assertEquals(0, resultado);
    }

    @Test
    void deveRetornarZeroQuandoNomeForVazio() {
        List<String> nomes = List.of("Ana", "Pedro");

        int resultado = Desafio08.contarOcorrencias(nomes, "");

        assertEquals(0, resultado);
    }
}
