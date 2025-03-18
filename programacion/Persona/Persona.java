package programacion.Persona;

import java.util.Scanner;

/**
 * Clase que representa a una Persona con sus atributos y comportamientos
 * básicos.
 *
 * @author Tu_Nombre
 * @version 1.0
 */
public class Persona {
    /**
     * Consante que define la mayoría de edad de una persona
     *
     */
    public static final int MAYORIA_EDAD = 18;

    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Edad de la persona
     */
    private int edad;

    /**
     * Constructor de Persona
     *
     * @param String nombre
     * @param int    edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método que nos devuelve la edad de la persona en 10 años
     *
     * @return edad + 10
     */
    private int edadDiezAños() {
        return edad + 10;
    }

    /**
     * Método que nos devuelve si la persona es mayor de edad o no
     *
     * @return
     */
    private boolean esMayorEdad() {
        return (edad >= MAYORIA_EDAD) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido, Introduzca su nombre: ");
        String name = scanner.nextLine();
        System.out.println("Ahora su edad: ");
        int age = scanner.nextInt();
        scanner.close();

        Persona persona = new Persona(name, age);
        System.out.println("Bienvenide " + persona.nombre);
        if (persona.esMayorEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("Su edad en 10 años es de: ");
        System.out.println(persona.edadDiezAños());
    }
}
