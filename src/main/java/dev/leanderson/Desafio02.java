package dev.leanderson;

import java.util.Arrays;

public class Desafio02 {
    // #2 - Soma de Array
    // Crie um metodo que receba um array de inteiros e retorne a soma de todos os valores.

    public static int somar(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return 0;
        }
        return Arrays.stream(numeros).sum();
    }

}
