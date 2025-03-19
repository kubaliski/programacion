package programacion.unidad_cinco_ejercicios;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int kilometraje;

    public Vehiculo(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public int conducir(int km) {
        if (km < 0) {
            throw new IllegalArgumentException("la cantidad recorrida a añadir no puede ser negativa");
        }
        return kilometraje += km;
    }

    public void mostrarKilometraje() {
        System.out.println(
                "Kilometraje actual para " + modelo + " de la marca " + marca + " es de " + kilometraje + "km");
    }

    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo("mazda", "jimbo", 12000);

        try {
            coche.conducir(2999);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        coche.mostrarKilometraje();
    }
}
