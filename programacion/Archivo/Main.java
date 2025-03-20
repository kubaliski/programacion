package programacion.Archivo;

public class Main {
    public static void main(String[] args) {
        try (Archivo archivo1 = new Archivo("archivo1.txt", 5);
                Archivo archivo2 = new Archivo("archivo2.txt", 3)) {
            archivo1.leer();
            archivo2.leer();
        }
        Archivo archivo3 = new Archivo("archivo3.txt", 1);
        archivo3.close();
        archivo3 = null;
        System.gc();
    }
}
