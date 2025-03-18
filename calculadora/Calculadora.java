import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Mostramos el menú
            System.out.println("\n---Calculadora---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.println("Elige una opción: ");
            option = scanner.nextInt();

            if (option >= 1 && option <= 5) {
                System.out.println("Introduce el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.println("Introduce el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (option) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error! no se puede dividir entre 0");
                        }
                        break;
                    case 5:
                        System.out.println("Resultado: " + Math.pow(num1, num2));
                        break;
                }

            } else if (option != 6) {
                System.out.println("Opción no valida");
            }

        } while (option != 6);
        System.out.println("Gracias por usar esta aplicación");

        scanner.close();
    }
}