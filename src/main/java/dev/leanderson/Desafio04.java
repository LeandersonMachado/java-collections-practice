package dev.leanderson;

import java.util.List;
import java.util.stream.Collectors;

public class Desafio04 {
    // #4 - List de Strings
    // Crie uma List<String> com pelo menos 6 nomes que: liste todos os nomes e liste apenas os
    // nomes com mais de 4 caracteres

    public static List<String> filtrarPorTamanho(List<String> nomes) {

        if (nomes == null || nomes.isEmpty()) {
            return List.of();
        }

        int filtroValor = 4;
        return nomes.stream()
                .filter(nome -> nome.length() > filtroValor)
                .collect(Collectors.toList());
    }


}
