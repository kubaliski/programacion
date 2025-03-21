package programacion.unidad_ocho_ejercicios.EstuBi;

public class Bicicleta {
    private String color;
    private String modelo;

    public Bicicleta(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarInformacion() {
        System.out.println("La bicileta " + modelo + " tiene un color " + color);
    }
}