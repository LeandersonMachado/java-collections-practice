package dev.leanderson;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Desafio05 {
    // #5 - Filtrar números pares
    // Crie um metodo que receba List<Integer> && retorne List<Integer> && contenha apenas
    // números pares

    public static List<Integer> filtrarPares(List<Integer> lista) {
        if (lista == null) {
            return List.of();
        }
        return lista.stream().filter(numero -> numero % 2 == 0).collect(toList());
    }


}
