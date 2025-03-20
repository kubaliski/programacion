package programacion.unidad_siete_ejercicios;

public class Tipos {
    public static void main(String[] args) {
        int integro = 1;
        Integer objetoIntegro = Integer.valueOf(integro);

        double doble = 1.23;
        Double objetoDoble = Double.valueOf(doble);

        char caracter = 'A';
        Character objetoCaracter = Character.valueOf(caracter);

        boolean boleano = true;
        Boolean objetoBoleano = Boolean.valueOf(boleano);

        System.out.println("Tipo básico" + integro);
        System.out.println("Objeto" + objetoIntegro);

        System.out.println("Tipo básico" + doble);
        System.out.println("Objeto" + objetoDoble);

        System.out.println("Tipo básico" + caracter);
        System.out.println("Objeto" + objetoCaracter);

        System.out.println("Tipo básico" + boleano);
        System.out.println("Objeto" + objetoBoleano);
    }
}