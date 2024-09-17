package ExerciciosSA2;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[20];
        int soma = 0, maior, menor;

        //Leitura dos valores
        System.out.print("Digite o valor 1: ");
        valores[0] = scanner.nextInt();
        soma = valores[0];
        maior = valores[0];
        menor = valores[0];

        for (int i = 1; i < 20; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
            soma += valores[i];

            //Verificação de maior e menor
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        //Cálculo da média
        double media = soma / 20.0;

        //Exibição dos resultados
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
