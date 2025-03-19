package programacion.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        mostrarInformacion();
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            throw new IllegalArgumentException("La cantidad a retirar no puede superar el saldo");
        }
        saldo -= cantidad;
        mostrarInformacion();
    }

    public void mostrarInformacion() {
        System.out.println("El estado actual de su cuenta " + numeroCuenta + " es: " + saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria("EA12345", 30000);

        System.out.println("Bienvenido");
        cuenta.mostrarInformacion();

        boolean continuar = true;

        while (continuar) {
            System.out.println("----Seleccione una operacion----");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver estado de su cuenta");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            String cierre = "Gracias por usar nuestros servicios";

            switch (opcion) {
                case 1:
                    System.out.println("---Elija una cantidad a depositar---");
                    double cantidadD = sc.nextDouble();
                    sc.nextLine();

                    cuenta.depositar(cantidadD);

                    break;
                case 2:
                    System.out.println("---Elija una cantidad a retirar---");
                    double cantidadR = sc.nextDouble();
                    sc.nextLine();
                    try {
                        cuenta.retirar(cantidadR);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    break;
                case 3:
                    cuenta.mostrarInformacion();

                    break;

                case 4:
                    continuar = false;
                    System.out.println(cierre);
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}
