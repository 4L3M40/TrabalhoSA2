package ExerciciosSA2;

import java.util.Scanner;

public class ExercicioQuatro {

    //Método para desenhar a linha com '_'
    public static void desenharLinha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Tarefa 4 - Desenhar uma linha com '_'
        System.out.println("\nTarefa 4:");
        System.out.print("Digite o tamanho da linha: ");
        int tamanho = scanner.nextInt();

        //Chamando o método para desenhar a linha
        desenharLinha(tamanho);

        scanner.close();
    }
}
