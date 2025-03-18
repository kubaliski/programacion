package programacion.unidad_cuatro_ejercicios;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un String: ");
        String texto = sc.nextLine();
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o'
                    || texto.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
