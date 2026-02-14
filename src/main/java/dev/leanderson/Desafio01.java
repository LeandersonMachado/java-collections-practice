package dev.leanderson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio01 {
    // #1 - Array Basico
    // Crie um array de inteiros com 5 posições.
    // Peça ao usuário para informar os valores e depois liste todos os números.

    public static int[] lerNumeros(Scanner scanner) {

        int[] exercicio = new int[5];

        for (int i = 0; i < exercicio.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");

            try {
                exercicio[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro ao inserir numero: " + e.getMessage());
                scanner.next();
                i--;
            }
        }
        return exercicio;
    }

    public static void listarNumeros(int [] numeros) {
        for ( int n : numeros) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] nums = lerNumeros(scanner);
            listarNumeros(nums);
        }
    }

}
