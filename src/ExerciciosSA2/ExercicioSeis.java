package ExerciciosSA2;

import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário o número de horas
        System.out.print("Digite o número de horas: ");
        int horas = scanner.nextInt();

        //Conversão de horas para segundos (1 hora = 3600 segundos)
        int segundos = horas * 3600;

        //Exibe o resultado
        System.out.println(horas + " horas são " + segundos + " segundos.");

        scanner.close();
    }
}
