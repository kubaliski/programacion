package programacion.unidad_dos_ejercicios;

public class Tipos {
    // 5.1
    int edad = 12;
    float temperatura = 24.12f;
    char letra = 'P';
    boolean isStudent = true;
    // 5.2
    double decimal = 45.8;
    int entero = (int) decimal;
    int empleados;
    boolean state;
    String companyName;

    public static void main(String[] args) {
        Tipos datos = new Tipos();
        System.out.println(datos.empleados);
        System.out.println(datos.companyName);
        System.out.println(datos.state);

    }

}