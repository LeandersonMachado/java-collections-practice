package dev.leanderson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio09 {

    public static List<Integer> ordenarCrescente(List<Integer> lista) {
        if (lista == null) return List.of();

        List<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia);
        return copia;
    }

    public static List<Integer> ordenarDecrescente(List<Integer> lista) {
        if (lista == null) return List.of();

        List<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia, Collections.reverseOrder());
        return copia;
    }
}
