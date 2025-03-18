import java.util.Scanner;

public class CelciusAFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los grados celsius a transformar: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * (9 / 5) + 32;
        System.out.println("Los grados son: " + fahrenheit);
        scanner.close();
    }
}
