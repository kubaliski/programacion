package programacion.Libro;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public void mostrarInformacion() {
        System.out.println("titulo: " + titulo + " autor: " + autor);
    }
}
