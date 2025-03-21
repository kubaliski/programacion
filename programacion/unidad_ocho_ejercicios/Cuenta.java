package programacion.unidad_ocho_ejercicios;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            throw new IllegalArgumentException("Monto no puede ser mayor al saldo");

        }

        saldo -= monto;
    }

    public void mostrarInformacion() {
        System.out.println("Mostrando saldo de la cuenta" + saldo);
    }

    public static void operaciones(Cuenta cuenta, double deposito, double retiro) {
        cuenta.depositar(deposito);
        try {
            cuenta.retirar(retiro);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        cuenta.mostrarInformacion();
    }

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1200);
        System.out.println("Cuenta fuera del método");
        cuenta.mostrarInformacion();
        System.out.println("Cuenta dentro del método");
        Cuenta.operaciones(cuenta, 400, 500);
        System.out.println("Cuenta fuera del método despues de operar");
        cuenta.mostrarInformacion();
    }
}
