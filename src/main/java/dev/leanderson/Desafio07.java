package dev.leanderson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio07 {
    // #7 - Converter Array em List
    // Crie um metodo que: receba String[] && retorne List<String> && preserve os valores

    public static List<String> convertToList(String[] arrayNomes) {
        if (arrayNomes == null) {
            return List.of();
        }
        return new ArrayList<>(Arrays.asList(arrayNomes));
    }


}
