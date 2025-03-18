package programacion.unidad_cuatro_ejercicios;

import java.util.Arrays;

public class MayorMenor {
    public static void main(String[] args) {
        int[] arraigo = { 12, 2, 34, 123, 6, 32, 29 };
        Arrays.sort(arraigo);
        System.out.println(arraigo[0]);
        System.out.println(arraigo[arraigo.length - 1]);
        for (int arr : arraigo) {
            System.out.println(arr);
        }
    }
}
