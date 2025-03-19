package programacion.Producto;

import java.util.Scanner;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return cantidadEnStock;
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        this.precio = nuevoPrecio;
    }

    public double calcularValorInventario() {

        double total = precio * cantidadEnStock;
        System.out.println("El valor total del inventario es de " + total);
        return total;
    }

    public void mostrarInformacion() {
        System.out.println(getNombre() + " " + getPrecio() + " $ por unidad " + getStock() + " unidades"
                + " con un valor total de "
                + calcularValorInventario());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un producto: ");
        String nombre = sc.nextLine();
        System.out.println("Asigne un precio: ");
        double precio = sc.nextDouble();
        sc.nextLine(); // Consumir el carácter de nueva línea pendiente
        System.out.println("De cuantas unidades disponemos?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Producto producto = new Producto(nombre, precio, cantidad);

        producto.mostrarInformacion();

        System.out.println("¿Desea actualizar el precio? (si/no)");
        String respuesta = sc.nextLine();
        if (respuesta.equals("si")) {
            try {
                System.out.println("Introduzca un nuevo precio: ");
                double nuevoPrecio = sc.nextDouble();

                producto.setPrecio(nuevoPrecio);

            } catch (Exception e) {
                System.out.println("Error!: " + e.getMessage());
            }
            producto.mostrarInformacion();
            System.out.println("Gracias por registrar un producto");
        } else {
            producto.mostrarInformacion();
            System.out.println("Gracias por registrar un producto");
        }

        sc.close();
    }
}
