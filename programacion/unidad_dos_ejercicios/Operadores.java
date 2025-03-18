package programacion.unidad_dos_ejercicios;

public class Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int suma = num1 + num2;
        int resta = num1 - num2;
        float division = num1 / num2;
        int multiplicacion = num1 * num2;
        int modulo = num1 % num2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(division);
        System.out.println(modulo);
        System.out.println(multiplicacion);

        int a = 12;
        int b = 4;
        int c = -25;

        if (a > b && b > c) {
            System.out.println("A es mayor que b y b mayor que c");
        }

        String mensajeA = (a < 0) ? "A es negativo" : "A es positivo";
        String mensajeB = (b < 0) ? "B es negativo" : "B es positivo";
        String mensajeC = (c < 0) ? "C es negativo" : "C es positivo";

        System.out.println(mensajeA);
        System.out.println(mensajeB);
        System.out.println(mensajeC);
    }
}
