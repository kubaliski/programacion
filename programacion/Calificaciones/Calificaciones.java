package programacion.Calificaciones;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Introduce el numero de estudiantes: ");
            int numEstudiantes = sc.nextInt();
            int[] calificaciones = new int[numEstudiantes];

            for (int i = 0; i < numEstudiantes; i++) {
                System.out.println("Introduce la calicación del estudiante " + (i + 1) + ":");
                calificaciones[i] = sc.nextInt();
            }

            int suma = 0;
            for (int calificacion : calificaciones) {
                suma += calificacion;
            }

            double promedio = (double) suma / numEstudiantes;

            String nivel;

            if (promedio >= 90) {
                nivel = "Excelente";
            } else if (promedio >= 79) {
                nivel = "Bueno";
            } else if (promedio >= 69) {
                nivel = "Regular";
            } else {
                nivel = "Insuficiente";
            }

            System.out.println("Promeido del grupo: " + promedio);
            System.out.println("Nivel: " + nivel);
            System.out.println("Desea registrar otro grupo? (si/no):");
            sc.nextLine();
            String respuesta = sc.nextLine();
            continuar = respuesta.equalsIgnoreCase("si");
            System.out.println("Gracias por usar el ssitema, ADIOS!");

        }

        sc.close();

    }
}
