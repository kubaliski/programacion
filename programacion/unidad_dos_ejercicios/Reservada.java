package programacion.unidad_dos_ejercicios;

public class Reservada {

    public static void main(String[] args) {

        int peso = 78;

        System.out.println(canIRideIt(peso));
    }

    public static boolean canIRideIt(int peso) {
        if (peso > 70 || peso <= 20) {
            return false;
        } else {
            return true;
        }

    }

}
