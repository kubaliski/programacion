package programacion.unidad_ocho_ejercicios;

public class Alumno {
    private String nombre;
    private int edad;
    private double notaMedia;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void mostrarInformacion() {
        System.out.println(
                "El alumno " + nombre + " con " + edad + " años de edad, tiene  una nota media de " + notaMedia);
    }

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.setEdad(12);
        alumno1.setNombre("Pedro");
        alumno1.setNotaMedia(7.23);

        alumno1.mostrarInformacion();
    }
}
