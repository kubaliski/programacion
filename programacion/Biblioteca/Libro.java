package programacion.Biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public void mostrarInformacion() {
        String diponibilidad = (disponible) ? "disponible" : "no disponible";
        System.out.println("Libro: " + titulo + " escrito por " + autor + "se ecuentra: " + diponibilidad);
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (!isDisponible()) {
            throw new IllegalStateException("El libro no está disponible para prestar");
        }

        disponible = false;
        System.out.println("El libro " + titulo + " ha sido prestado");
    }

    public void devolver() {
        if (isDisponible()) {
            throw new IllegalStateException("El libro no estaba prestado");
        }

        disponible = true;
        System.out.print("El libro " + titulo + " ha sido devuelto");
    }
}
