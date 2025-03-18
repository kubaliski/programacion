package programacion.unidad_cuatro_ejercicios;

import java.util.Arrays;

public class Calificaciones {
    public static void main(String[] args) {
        double[] calificaciones = { 8.25, 5.60, 9.5, 8.75, 10 };
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        double media = suma / calificaciones.length;

        // Para sacar valores minimos y maximos no queremos mutar el array , creamos una
        // copia

        double[] calificacionesSort = Arrays.copyOf(calificaciones, calificaciones.length);
        Arrays.sort(calificacionesSort);

        double min = calificacionesSort[0];
        double max = calificacionesSort[calificacionesSort.length - 1];
        for (double calificacion : calificacionesSort) {
            System.out.println(calificacion);
        }
        System.out.println(
                "El resultado de los examenes, media: " + media + " peor nota: " + min + " mejor nota: " + max);
    }
}
