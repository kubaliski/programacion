package programacion.Tarea;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea {
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion, boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public Tarea(String descripcion2) {
        this.descripcion = descripcion2;
    }

    public void marcarCompletada() {
        if (!completada) {
            completada = true;
            System.out.print("La tarea: " + descripcion + " se ha completado.");
        } else {
            System.out.println("La tarea " + descripcion + " ya estaba completada");
        }

    }

    public void mostrarEstado() {
        String estado = (completada) ? "completada" : "por hacer";

        System.out.println("Tarea:  " + descripcion + " Estado:  " + estado);
    }

    public static void main(String[] args) {
        ArrayList<Tarea> listaTareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú de Gestión de Tareas ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Completar una tarea");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce una descripción para la tarea: ");
                    String descripcion = sc.nextLine();
                    listaTareas.add(new Tarea(descripcion));
                    System.out.print("Tarea añadida!");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Tareas ---");
                    for (Tarea tarea : listaTareas) {
                        tarea.mostrarEstado();
                    }
                    break;
                case 3:
                    System.out.println("\n--- Seleccione una tarea a completar ---");
                    for (int i = 0; i < listaTareas.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        listaTareas.get(i).mostrarEstado();
                    }
                    int indice = sc.nextInt() - 1;
                    if (indice >= 0 && indice < listaTareas.size()) {
                        listaTareas.get(indice).marcarCompletada();
                    } else {
                        System.out.println("Indice invalido");
                    }
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema");
                default:
                    break;
            }
        }

        sc.close();
    }
}
