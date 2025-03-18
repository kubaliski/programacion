public class Promedio {
    public static void main(String[] args) {
        int[] array = { 6, 12, 32, 412, 5 };
        int length = array.length;
        int suma = 0;

        for (int i = 0; i < length; i++) {
            suma += array[i];
        }

        double promedio = (double) suma / length;

        System.out.println("El promedio del array es " + promedio);
    }

}
