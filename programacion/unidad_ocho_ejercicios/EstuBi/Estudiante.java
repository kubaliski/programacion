package programacion.unidad_ocho_ejercicios.EstuBi;

public class Estudiante {
    private String nombre;
    private Bicicleta bicicleta;
    private String curso;

    public Estudiante(String nombre, Bicicleta bicicleta, String curso) {
        this.nombre = nombre;
        this.bicicleta = bicicleta;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void mostrarInformacion() {
        System.out.println("En el curso " + curso + " está " + nombre + " que tiene una bicicleta del modelo "
                + bicicleta.getModelo() + " de color " + bicicleta.getColor());
    }
}
