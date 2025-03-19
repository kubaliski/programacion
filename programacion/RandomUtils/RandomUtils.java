package programacion.RandomUtils;

public class RandomUtils {
    public static int generarNumeroAleatorio(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) {
        System.out.println(generarNumeroAleatorio(2, 110));
    }
}
