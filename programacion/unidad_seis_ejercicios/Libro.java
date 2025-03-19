package programacion.unidad_seis_ejercicios;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;

    }

    public void mostrarInformacion() {
        System.out.println("El libro " + titulo + " escrito por " + autor + " con " + numeroDePaginas + " páginas");
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Poncho fue", "Sole Otero", 122);
        Libro libro2 = new Libro("Escapar", "Guy Asecas", 222);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
