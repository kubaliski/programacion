package programacion.unidad_tres_ejercicios;

import java.util.Scanner;

public class ForSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = scanner.nextInt();
        scanner.close();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println(suma);
    }
}
