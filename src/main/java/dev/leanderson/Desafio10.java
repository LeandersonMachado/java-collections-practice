package dev.leanderson;


import java.util.List;

public class Desafio10 {
    // #10 - Desafio de lógica
    // Crie um metodo que receba uma List<String> e retorne a maior palavra da lista.

    public static String verificarMaior(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }

        String maior = "";

        for (String nome : lista) {
            if (nome.length() > maior.length()) {
                maior = nome;
            }
        }
        return maior;
    }


}
