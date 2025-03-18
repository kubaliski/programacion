package programacion.unidad_tres_ejercicios;

import java.util.Scanner;

public class Cajero {
    private double saldo;

    public Cajero(double saldo) {
        this.saldo = saldo;
    }

    private double retirarDinero(double cantidad) {
        if (this.saldo < 0) {
            throw new ArithmeticException("El saldo no puede ser negativo");
        }

        if (this.saldo - cantidad < 0) {
            throw new ArithmeticException("El saldo resultante no puede ser negativo");
        }

        this.saldo -= cantidad;
        System.out.print("Su nuevo saldo es de " + this.saldo);
        return this.saldo;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cantidad que retirar: ");
        double cantidad = scanner.nextDouble();

        Cajero cajero = new Cajero(1200.63);
        try {
            cajero.retirarDinero(cantidad);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
