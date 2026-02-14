package dev.leanderson;

import java.util.List;

public class Desafio08 {
    // #8 - Contar ocorrências
    // Crie um metodo que receba: uma List<String> uma String de busca e retorne quantas vezes essa
    // String aparece na lista.

    // Resposta #1
    public static int contarOcorrencias(List<String> listaNomes, String nome) {
        if (listaNomes == null || listaNomes.isEmpty() || nome == null || nome.isEmpty()) {
            return 0;
        }

        return Math.toIntExact(listaNomes.stream()
                .filter(n -> n.equalsIgnoreCase(nome))
                .count());

    }


}
