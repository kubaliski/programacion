package programacion.unidad_tres_ejercicios;

import java.util.Scanner;

public class Par {
    public boolean esPar(int num) {
        return (num % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();

        Par par = new Par();
        System.out.println(par.esPar(num));
        scanner.close();
    }
}
