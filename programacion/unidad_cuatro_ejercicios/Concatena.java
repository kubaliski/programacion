package programacion.unidad_cuatro_ejercicios;

import java.util.Scanner;

public class Concatena {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu apellido: ");
        String apellido = scanner.nextLine();

        // String completo = nombre + " " + apellido;
        String completo = nombre.concat(" ").concat(apellido);

        System.out.println("Bienvenido ,completo: " + completo);

        scanner.close();
    }
}
