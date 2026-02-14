import dev.leanderson.Desafio09;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Desafio09Test {

    @Test
    void deveOrdenarEmOrdemCrescente() {
        List<Integer> entrada = List.of(8, 5, 7, 4, 2);

        List<Integer> resultado = Desafio09.ordenarCrescente(entrada);

        assertEquals(List.of(2, 4, 5, 7, 8), resultado);
    }

    @Test
    void deveOrdenarEmOrdemDecrescente() {
        List<Integer> entrada = List.of(8, 5, 7, 4, 2);

        List<Integer> resultado = Desafio09.ordenarDecrescente(entrada);

        assertEquals(List.of(8, 7, 5, 4, 2), resultado);
    }

    @Test
    void naoDeveAlterarListaOriginal() {
        List<Integer> entrada = new ArrayList<>(List.of(3, 1, 2));

        Desafio09.ordenarCrescente(entrada);

        assertEquals(List.of(3, 1, 2), entrada);
    }

    @Test
    void deveRetornarListaVaziaQuandoEntradaForNull() {
        List<Integer> resultado = Desafio09.ordenarCrescente(null);

        assertEquals(List.of(), resultado);
    }
}
