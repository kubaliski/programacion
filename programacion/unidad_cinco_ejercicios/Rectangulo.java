package programacion.unidad_cinco_ejercicios;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    public boolean isASquare() {
        return (base == altura) ? true : false;
    }

    public static void main(String[] args) {
        Rectangulo cuadrado = new Rectangulo(2, 2);

        System.out.println(cuadrado.calcularArea());
        System.out.println(cuadrado.calcularPerimetro());
        System.out.println(cuadrado.isASquare());

    }
}
