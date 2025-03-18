package programacion.unidad_tres_ejercicios;

import java.util.Scanner;

public class DosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        int num1 = scanner.nextInt();
        System.out.println("Ahora el segundo: ");
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num1 + " es igual que " + num2);
        }
    }

}
