package programacion.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println(libro + " añadido a la biblioteca");
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("--Libros disponibles para prestamo--");

        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInformacion();
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El Aleph", "Borges");
        Libro libro2 = new Libro("Contra muros y banderas", "El Roto");
        Libro libro3 = new Libro("El Guión Story", "Robert McKee");
        Libro libro4 = new Libro("Poncho Fue", "Sole Otero");
        Libro libro5 = new Libro("Solanin", "Ino Asano");
        Libro libro6 = new Libro("Angeles Fosiles", "Alan Moore");

        biblioteca.libros.add(libro1);
        biblioteca.libros.add(libro2);
        biblioteca.libros.add(libro3);
        biblioteca.libros.add(libro4);
        biblioteca.libros.add(libro5);
        biblioteca.libros.add(libro6);

        biblioteca.mostrarLibrosDisponibles();

        Usuario user1 = new Usuario("Angel");
        try {
            user1.prestarLibro(libro6);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            user1.prestarLibro(libro2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            user1.prestarLibro(libro1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            user1.prestarLibro(libro4);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        user1.mostrarInformacion();

    }
}
