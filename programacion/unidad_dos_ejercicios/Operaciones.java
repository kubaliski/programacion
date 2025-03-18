package programacion.unidad_dos_ejercicios; // en el ejercicio es miPrograma pero para mantener sensatez lo llamamos con la carpeta

public class Operaciones {

    public void Sumar(int num1, int num2) {
        System.out.println("La suma es de " + (num1 + num2));
    }

    public static void main(String[] args) {
        System.out.println("Programa iniciado");
        int num1 = 1;
        int num2 = 2;

        Operaciones operaciones = new Operaciones();
        operaciones.Sumar(num1, num2);
    }
}
