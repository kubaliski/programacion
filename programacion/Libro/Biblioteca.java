package programacion.Libro;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("Libros en biblioteca: ");
        for (Libro libro : libros) {
            libro.mostrarInformacion();
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Escapar", "Guy Asecas");
        Libro libro2 = new Libro("Poncho fue", "Sole Otero");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.mostrarLibros();
    }
}
