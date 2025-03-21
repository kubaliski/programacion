package programacion.unidad_nueve_ejercicios;

import java.io.*;

public class Datos {
    public static void main(String[] args) {
        int count = 0;

        // Primero leer el archivo
        try (BufferedReader br = new BufferedReader(
                new FileReader("programacion/unidad_nueve_ejercicios/datos.txt"))) {

            while (br.readLine() != null) {
                count++;
            }

        } catch (IOException e) {
            System.out.println("Error en lectura: " + e.getMessage());
        }

        // Luego escribir el resultado
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("programacion/unidad_nueve_ejercicios/resultado.txt", true))) {

            bw.newLine(); // Añadir una nueva línea
            bw.write("El archivo contiene " + count + " líneas.");

        } catch (IOException e) {
            System.out.println("Error en escritura: " + e.getMessage());
        }

        System.out.println("Proceso completado. El archivo contiene " + count + " líneas.");
    }
}