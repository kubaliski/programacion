package programacion.unidad_tres_ejercicios;

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para generar la tabla: ");
        int num = scanner.nextInt();
        System.out.println("---Generando la tabla del " + num);

        int multiplo = 1;
        do {
            System.out.println(num + " por " + multiplo + " igual a " + (num * multiplo));
            multiplo++;
        } while (multiplo <= 10);
        scanner.close();
    }
}
