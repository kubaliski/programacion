package programacion.Archivo;

import java.io.Closeable;

public class Archivo implements Closeable {
    private String nombre;
    private int tamano; // EN MB

    public Archivo(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
        System.out.println("Archivo abierto: " + nombre + ", Tamaño " + tamano + "MB");
    }

    public void leer() {
        System.out.println("Leyendo el contenido de " + nombre);
    }

    @Override
    public void close() {
        System.out.println("Cerrando " + nombre + " con un tamaño de " + tamano);
    }
}