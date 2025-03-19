package programacion.Habitacion;

public class Habitacion {
    private int numeroHabitacion;
    private double precio;
    private boolean reservada;

    public Habitacion(int numeroHabitacion, double precio, boolean reservada) {
        this.numeroHabitacion = numeroHabitacion;
        this.precio = precio;
        this.reservada = reservada;
    }

    public void reservarHabitacion() {
        if (reservada) {
            throw new IllegalStateException("Esta habitación ya estaba reservada");
        }
        reservada = true;
    }

    public void cancelarReserva() {
        if (!reservada) {
            throw new IllegalStateException("La habitación no estaba reservada");
        }

        reservada = false;
    }

    public void mostrarInformacion() {
        String estado = (reservada) ? "reservada" : "no reservada";
        System.out.println("La habitación " + numeroHabitacion + " con precio " + precio + "$ , está " + estado);
    }

    public static void main(String[] args) {
        Habitacion primera = new Habitacion(1, 230, true);
        Habitacion segunda = new Habitacion(2, 400, false);

        primera.mostrarInformacion();
        segunda.mostrarInformacion();

        try {
            primera.cancelarReserva();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            segunda.reservarHabitacion();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Parseando actualizaciones...");
        primera.mostrarInformacion();
        segunda.mostrarInformacion();
    }
}
