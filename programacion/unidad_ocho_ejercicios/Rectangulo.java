package programacion.unidad_ocho_ejercicios;

public class Rectangulo {
    private double base;
    private double altura;

    static int totalRectangulos = 0;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        totalRectangulos++;
    }

    public double calcularArea() {
        return base * altura;
    }

    public static void getTotalRectangulos() {
        System.out.println("El total de rectangulos creados es de: " + totalRectangulos);
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(12, 12);
        Rectangulo rectangulo2 = new Rectangulo(10, 4);

        rectangulo1.calcularArea();
        rectangulo2.calcularArea();

        Rectangulo.getTotalRectangulos();
    }
}
