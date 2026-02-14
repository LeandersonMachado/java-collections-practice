import dev.leanderson.Desafio10;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Desafio10Test {

    @Test
    void deveRetornarMaiorPalavra() {
        List<String> lista = List.of("Beatriz", "Ana", "Pedro");

        String resultado = Desafio10.verificarMaior(lista);

        assertEquals("Beatriz", resultado);
    }

    @Test
    void deveRetornarPrimeiraMaiorEmCasoDeEmpate() {
        List<String> lista = List.of("Joao", "Jose", "Luis");

        String resultado = Desafio10.verificarMaior(lista);

        assertEquals("Joao", resultado);
    }

    @Test
    void deveRetornarNullQuandoListaForVazia() {
        List<String> lista = List.of();

        String resultado = Desafio10.verificarMaior(lista);

        assertNull(resultado);
    }

    @Test
    void deveRetornarNullQuandoListaForNull() {
        String resultado = Desafio10.verificarMaior(null);

        assertNull(resultado);
    }
}
