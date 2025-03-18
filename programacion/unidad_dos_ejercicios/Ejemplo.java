package programacion.unidad_dos_ejercicios; // package es palabra reservada

public class Ejemplo { // public , class son palabras reservadas Ejemplo es identificador
    private int edad; // private, int son palabras reservadas , edad es identificador

    public void calcularEdad() { // public y void son palabras reservadas , calcularEdad es identificador
        if (edad > 18) { // if , else son palabras reservadas
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
