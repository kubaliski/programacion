package programacion.unidad_dos_ejercicios;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un radio para nuestro circulo: ");
        double radio = scanner.nextInt();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("el area es :" + area);

        scanner.close();
    }
}
