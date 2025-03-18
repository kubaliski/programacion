package programacion.unidad_tres_ejercicios;

import java.util.Scanner;

public class Clasificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = scanner.nextInt();
        scanner.close();

        if (edad >= 65) {
            System.out.println("Mayor");
        } else if (edad < 65 && edad >= 18) {
            System.out.println("Adulto");

        } else if (edad < 18 && edad >= 12) {
            System.out.println("Adolescente");
        } else if (edad < 12 && edad >= 0) {
            System.out.println("Niño");
        } else {
            System.out.println("Edad no valida");
        }
    }
}
