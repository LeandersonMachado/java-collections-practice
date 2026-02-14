import dev.leanderson.Desafio01;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Desafio01Test {

    @Test
    void deveLerCincoNumerosCorretamente() {
        String input = "1 2 3 4 5";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        int[] resultado = Desafio01.lerNumeros(scanner);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, resultado);
    }

    @Test
    void deveIgnorarEntradaInvalidaEContinuarLeitura() {
        String input = "1 a 2 b 3 4 5";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        int[] resultado = Desafio01.lerNumeros(scanner);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, resultado);
    }
}
