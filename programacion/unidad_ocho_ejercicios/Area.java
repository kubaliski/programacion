package programacion.unidad_ocho_ejercicios;

public class Area {

    /*
     * Calcular area para circulos
     */
    public double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, radio);
    }

    /*
     * Calcular area para rectangulos
     */
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    /*
     * Calcular area para triangulos
     */
    public double calcularArea(int base, int altura) {
        return (base * altura) / 2.0;
    }
}
