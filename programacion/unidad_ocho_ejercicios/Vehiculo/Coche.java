package programacion.unidad_ocho_ejercicios.Vehiculo;

public class Coche extends Vehiculo {
    private int velocidadMaxima;

    public Coche(int velocidadMaxima, String marca, String modelo) {
        super(marca, modelo);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El coche es de la marca " + marca + " y es el modelo " + modelo
                + "y alcanza una velocidad máxima de " + velocidadMaxima);

    }

    public void mostrarVelocidad() {
        System.out.println(velocidadMaxima);
    }

}
