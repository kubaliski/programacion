package programacion.unidad_siete_ejercicios;

public class Persona {
    private String nombre;
    private int edad;
    private Persona dependiente;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 12);
        Persona persona2 = new Persona("Pedro", 23);

        persona1.dependiente = persona2; // Referencia ciclica
        System.out.println(persona1.dependiente.nombre + " " + persona1.dependiente.edad);

    }
}
