package programacion.unidad_cinco_ejercicios;

public class Libro {
    /*
     * Atributos
     */
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + " escrito por: " + autor + " y  con un precio de: " + precio + "€");
    }

    public static void main(String[] args) {
        Libro escapar = new Libro("escapar", "Guy Dell", 22.91);
        escapar.mostrarInformacion();
    }
}