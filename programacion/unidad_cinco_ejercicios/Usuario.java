package programacion.unidad_cinco_ejercicios;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public void setContrasena(String nuevaContrasena) {
        if (verificarContrasena(nuevaContrasena)) {
            contrasena = nuevaContrasena;
            System.out.println("Nueva contraseña establecida");
        } else {
            System.out.println("Error contraseña no válida");
        }
    }

    public boolean verificarContrasena(String contrasena) {
        return contrasena.length() > 6;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void getUsuario() {
        System.out.println("Su usuario y contraseña son " + nombre + "-" + contrasena);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido introduza el nombre de usuario que desee ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca ahora su contraseña deseada: ");
        String contrasena = sc.nextLine();

        Usuario user = new Usuario(nombre, contrasena);

        // Verificar la contraseña inicial y solicitar nueva si es necesario
        while (!user.verificarContrasena(user.getContrasena())) {
            System.out.println("Por favor introduzca una contraseña válida (más de 6 caracteres):");
            String nuevaContrasena = sc.nextLine();
            user.setContrasena(nuevaContrasena);
        }

        // Mostrar información del usuario al finalizar
        user.getUsuario();
        sc.close();
    }
}