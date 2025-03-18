import java.util.Scanner;

public class NumerosEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce tu numero: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Tu número es positivo");

        } else if (num < 0) {
            System.out.println("Tu número es negativo");

        } else {
            System.out.println("Tu número es cero");

        }

        scanner.close();
    }
}
