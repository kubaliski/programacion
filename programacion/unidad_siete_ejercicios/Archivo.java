package programacion.unidad_siete_ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("programacion/unidad_siete_ejercicios/archivo.txt"))) {
            String linea = br.readLine();
            System.out.println(linea);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
