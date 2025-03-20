package programacion.unidad_ocho_ejercicios;

public class Empleado {
    private String nombre;
    private double salario;
    private String departamento;

    public static int totalEmpleados;

    public Empleado() {
        this.nombre = "Desconocido";
        this.salario = 0;
        this.departamento = "N/A";
        totalEmpleados++;
    }

    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        totalEmpleados++;
    }

    public Empleado(String nombre, double salario) {
        this(nombre, salario, "N/A");// Aqui no aumentamos totalEmpleados porque estamos llamando al constructor
                                     // parametrizado

    }

    public void mostrarInformacion() {
        System.out.println(nombre + departamento + salario);
    }

    public int getTotalEmpleados() {
        return totalEmpleados;
    }

}
