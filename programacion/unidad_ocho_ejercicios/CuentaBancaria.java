package programacion.unidad_ocho_ejercicios;

public class CuentaBancaria {
    public String numeroCuenta;
    private double saldo;
    protected String titular;

    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            throw new IllegalArgumentException("la cantidad a retirar no puede ser superior al saldo");
        }

        saldo -= monto;
    }

    public void consultarSaldo() {
        System.out.println("El saldo para la cuenta " + numeroCuenta + " es de " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
