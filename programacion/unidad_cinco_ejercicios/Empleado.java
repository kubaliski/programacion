package programacion.unidad_cinco_ejercicios;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void modificarSalario(double porcentaje) {
        salario *= porcentaje;
        System.out.println("Su nuevo salario es de: " + salario);
    }

    public void mostrarInformacion() {
        System.out.println("Recuperando información del empleado solicitado ....");
        System.out.println("....");
        System.out.println("El empleado " + nombre + " con un salario de " + salario);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cree un nuevo empleado: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca un salario para " + nombre);
        double salario = sc.nextDouble();
        sc.nextLine();

        Empleado empleado = new Empleado(nombre, salario);

        System.out.println("Desea modificar el salario de su empleado? (si/no)");
        String respuesta = sc.nextLine();

        if (respuesta.equals("si")) {
            System.out.println("Introduzca un porcentaje para modificar el salario: ");
            double porcentaje = sc.nextDouble();
            empleado.modificarSalario(porcentaje);
            System.out.println("Mostando empleado actualizado:...");
            empleado.mostrarInformacion();
        }
        System.out.println("Gracias por usar nuestro programa");
        sc.close();
    }
}
