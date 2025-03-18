package programacion.unidad_dos_ejercicios;

/**
 * Clase que representa a una Persona con sus atributos y comportamientos
 * básicos.
 *
 * @author Tu_Nombre
 * @version 1.0
 */
public class Persona {
    /**
     * Constante que define la edad legal para ser considerado adulto.
     */
    public static final int MAYORIA_EDAD = 18;

    /**
     * Nombre de la persona.
     */
    private String nombre;

    /**
     * Edad de la persona en años.
     */
    private int edad;

    /**
     * Constructor que inicializa una nueva instancia de Persona.
     *
     * @param nombre El nombre de la persona
     * @param edad   La edad de la persona en años
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Imprime el nombre de la persona en la consola.
     */
    public void getName() {
        System.out.println(this.nombre);
    }

    /**
     * Verifica si la persona es mayor de edad.
     *
     * @return true si la persona es mayor de edad, false en caso contrario
     */
    public boolean isAdult() {
        return (edad > MAYORIA_EDAD) ? true : false;
    }

    /**
     * Método principal que demuestra el uso de la clase Persona.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Ángel", 29);
        persona.getName();
        System.out.println(persona.isAdult());
    }
}