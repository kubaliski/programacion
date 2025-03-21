package programacion.unidad_ocho_ejercicios.Vehiculo;

public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInformacion() {
        System.out.println("El vehiculo es de la marca " + marca + " y es el modelo " + modelo);
    }
}
