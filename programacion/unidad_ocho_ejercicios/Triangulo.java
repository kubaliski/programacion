package programacion.unidad_ocho_ejercicios;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Para triángulos generales
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Para triángulos equiláteros (sobrecarga sin parámetros)
    public double calcularAreaEquilatero() {
        return (Math.sqrt(3) / 4) * Math.pow(base, 2);
    }

    // Alternativa: crear una sobrecarga que permita calcular con valores diferentes
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    public double calcularAreaEquilatero(double lado) {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    public static void main(String[] args) {
        // Triángulo normal
        Triangulo triangulo = new Triangulo(3, 4);
        System.out.println("Área del triángulo normal: " + triangulo.calcularArea());

        // Triángulo equilátero (base 8)
        Triangulo eqTriangulo = new Triangulo(8, 6.93);
        System.out.println("Área del triángulo equilátero: " + eqTriangulo.calcularAreaEquilatero());

        // Usando métodos con parámetros
        System.out.println("Área con parámetros: " + triangulo.calcularArea(5, 6));
        System.out.println("Área equilátero con parámetro: " + triangulo.calcularAreaEquilatero(10));
    }
}