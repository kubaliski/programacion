package programacion.unidad_cinco_ejercicios;

public class Alumno {
    private String nombre;
    private double calificacion;

    public Alumno(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public boolean esAprobado() {
        return (calificacion >= 5.0) ? true : false;
    }

    public void mostrarEstado() {
        if (esAprobado()) {
            System.out.println("El alumno " + nombre + " ha aprobado con un " + calificacion);
        } else {
            System.out.println("El alumno " + nombre + " ha suspendido con un " + calificacion);
        }
    }

    public static void main(String[] args) {
        Alumno alba = new Alumno("Alba", 8.45);
        Alumno pedro = new Alumno("Pedro", 4.95);

        alba.mostrarEstado();
        pedro.mostrarEstado();
    }
}
