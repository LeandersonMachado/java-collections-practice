package dev.leanderson;

public class Desafio03 {
    // #3 - Maior e menor valor
    // Crie um metodo que receba um int[] e retorne:
    // o maior e o menor valor

    public static int[] verMaiorAndMenor(int[] numeros) {
        if (numeros.length == 0) {
            return null;
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int n : numeros) {
            if (n < menor) menor = n;
            if (n > maior) maior = n;
        }
        return new int[]{maior, menor};
    }


}
