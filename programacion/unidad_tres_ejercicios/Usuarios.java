package programacion.unidad_tres_ejercicios;

import java.util.Scanner;

public class Usuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.println("Introduce un numero de usuario :");
            numero = scanner.nextInt();
            if (numero == -1) {
                System.out.println("Programa finalizado");
                break;
            }
        }

        scanner.close();
    }
}
