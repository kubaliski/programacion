package programacion.Biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Libro> prestamos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    public void mostrarInformacion() {
        System.out.println("El usuario " + nombre);
        System.out.println("Libros en prestamo: ");
        if (prestamos.isEmpty()) {
            System.out.println(nombre + " no tiene libros prestados");
        } else {
            for (Libro libro : prestamos) {
                libro.mostrarInformacion();
            }
        }
    }

    public void prestarLibro(Libro libro) {
        if (prestamos.size() >= 3) {
            throw new IllegalArgumentException("No puede sacar más libros");
        }

        libro.prestar();
        prestamos.add(libro);
    }

    public void devolverLibro(Libro libro) {
        prestamos.remove(libro);
        libro.devolver();

    }
}
