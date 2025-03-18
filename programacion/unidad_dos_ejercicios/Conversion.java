package programacion.unidad_dos_ejercicios;

public class Conversion {
    public static void main(String[] args) {
        // 1
        int integral = 10;
        double doble = integral;
        System.out.println(doble);

        // 2
        double decimal = 10.2;
        int truncado = (int) decimal;
        System.out.println(truncado);

        // 3
        String cadena = "3";
        int cadenaIntegral = Integer.parseInt(cadena);
        System.out.println(cadenaIntegral);
        int numero = 4;
        String numeroEscrito = String.valueOf(numero);
        String continuacion = " es muy bonito";
        System.out.println(numeroEscrito + continuacion);

        // 4
        int num1 = 4;
        Integer objetoNum1 = num1;
        System.out.println(objetoNum1);
        int numeroObjeto = objetoNum1;
        System.out.println(numeroObjeto);
    }
}
