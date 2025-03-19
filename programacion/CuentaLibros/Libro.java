package programacion.CuentaLibros;

public class Libro {
    private String titulo;
    private String autor;
    private int copias;

    private static int totalLibros = 0;

    public Libro(String titulo, String autor, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.copias = copias;
        totalLibros++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCopias() {
        return copias;
    }

    public static int getTotalLibros() {
        return totalLibros;
    }

    public void setCopias(int copias) {
        if (copias < 0) {
            throw new IllegalArgumentException("El numero de copias no puede ser negativo");
        }
        this.copias = copias;
    }

    public void mostrarInformacion() {
        System.out.println("El libro: " + titulo + " escrito por " + autor + " tiene un total de " + copias
                + " copias disponibles");
    }

}
