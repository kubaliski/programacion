package programacion.unidad_cinco_ejercicios;

import java.util.Scanner;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Su nuevo saldo es de " + saldo);
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            throw new IllegalArgumentException("La cantidad a retirar no puede ser mayor que  el saldo");
        }
        saldo -= monto;
        System.out.println("Su nuevo saldo es de " + saldo);
    }

    public void consultarSaldo() {
        System.out.println("Su saldo es de " + saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(2000);

        System.out.println("Bienvenido a su cuenta seleccione una operacion: ");
        System.out.println("1 Consultar saldo");
        System.out.println("2 Depositar fondos");
        System.out.println("3 Retirar fondos");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                cuenta.consultarSaldo();
                break;
            case 2:
                System.out.println("Introduzca una cantidad a depositar: ");
                double montoD = sc.nextDouble();
                cuenta.depositar(montoD);
                break;
            case 3:
                System.out.println("Introduzca una cantidad a retirar: ");
                double montoR = sc.nextDouble();
                try {
                    cuenta.retirar(montoR);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

                break;
            default:
                System.out.print("Esa no es una opción valida");
                break;
        }

        System.out.println("Gracias por usar nuestros servicios!");

        sc.close();
    }
}
