package programacion.unidad_tres_ejercicios;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int num = scanner.nextInt();
        while (num <= 0) {
            System.out.println("Introduce un numero positivo: ");
            num = scanner.nextInt();
        }
        scanner.close();
    }

}
