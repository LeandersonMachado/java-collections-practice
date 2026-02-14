package dev.leanderson;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Desafio06 {
    // #6 - Remover duplicados
    // Crie um metodo que receba List<Integer> && retorne nova lista sem duplicatas && preserve a
    // ordem original

    public static List<Integer> removerDuplicatas(List<Integer> lista) {
        if (lista == null) {
            return List.of();
        }

        return lista.stream().distinct().collect(toList());

    }


}
