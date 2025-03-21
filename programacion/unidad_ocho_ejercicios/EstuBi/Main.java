package programacion.unidad_ocho_ejercicios.EstuBi;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("azul golden", "BTx");
        Estudiante estudiante = new Estudiante("Raul", bicicleta, "5ºA");

        estudiante.mostrarInformacion();
    }
}
