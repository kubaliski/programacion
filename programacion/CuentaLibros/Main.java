package programacion.CuentaLibros;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Escapar", "Guy Asecas", 12);
        Libro libro2 = new Libro("Poncho Fue", "Sole Otero", 25);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        libro1.setCopias(2);

        System.out.println(Libro.getTotalLibros());

    }
}
