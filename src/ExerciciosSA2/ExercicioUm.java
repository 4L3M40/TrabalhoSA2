package ExerciciosSA2;

import java.util.Arrays; // O import deve estar aqui, antes das classes.

public class ExercicioUm {
    public static void main(String[] args) {
        int[] L = {5, 7, 2, 9, 4, 1, 3};

        // a) Tamanho da lista
        System.out.println("Tamanho da lista: " + L.length);

        // b) Maior valor da lista
        int max = Arrays.stream(L).max().getAsInt();
        System.out.println("Maior valor da lista: " + max);

        // c) Menor valor da lista
        int min = Arrays.stream(L).min().getAsInt();
        System.out.println("Menor valor da lista: " + min);

        // d) Soma de todos os elementos da lista
        int sum = Arrays.stream(L).sum();
        System.out.println("Soma de todos os elementos: " + sum);

        // e) Lista em ordem crescente
        int[] crescente = L.clone();
        Arrays.sort(crescente);
        System.out.println("Lista em ordem crescente: " + Arrays.toString(crescente));

        // f) Lista em ordem decrescente
        int[] decrescente = L.clone();
        Arrays.sort(decrescente);
        for (int i = 0; i < decrescente.length / 2; i++) {
            int temp = decrescente[i];
            decrescente[i] = decrescente[decrescente.length - i - 1];
            decrescente[decrescente.length - i - 1] = temp;
        }
        System.out.println("Lista em ordem decrescente: " + Arrays.toString(decrescente));
    }
}
