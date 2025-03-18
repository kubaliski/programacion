package programacion.unidad_dos_ejercicios;

public class Precio {
    public static void main(String[] args) {
        String cliente = "Nombre";
        System.out.println(cliente);
        System.out.println(calculaPrecio(12.25));
    }

    public static double calculaPrecio(double totalSinIva) {
        double impuestos = totalSinIva * 0.21;
        return totalSinIva + impuestos;
    }
}
