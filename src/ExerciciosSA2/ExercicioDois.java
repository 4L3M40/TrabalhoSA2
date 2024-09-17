package ExerciciosSA2;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[4];
        int soma = 0;

        //Leitura dos valores
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
            soma += valores[i];
        }

        //Cálculo da média
        double media = soma / 4.0;

        //Exibição da média e se é positiva ou negativa
        System.out.println("Média: " + media);
        if (media > 1) {
            System.out.println("Positiva");
        } else {
            System.out.println("Negativa");
        }

        scanner.close();
    }
}
