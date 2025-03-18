import java.util.Scanner;

public class Between {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para verificar si está entre 1 y 100");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 100) {
            System.out.println("Tú número está entre 1 y 100");
        } else {
            System.out.println("Tú número no está entre 1 y 100");
        }

        scanner.close();
    }
}
