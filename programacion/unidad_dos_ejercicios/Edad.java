package programacion.unidad_dos_ejercicios;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        boolean esMayorDeEdad = (edad > 18) ? true : false;

        System.out.println(esMayorDeEdad);
        scanner.close();
    }
}
