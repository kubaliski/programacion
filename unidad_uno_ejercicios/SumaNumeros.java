import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introuce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma es: " + suma);

        scanner.close();
    }
}