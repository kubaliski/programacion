package programacion.unidad_ocho_ejercicios;

public class Test {
    public static int modificarVariable(int num) {
        return num + 2;
    }

    public static void main(String[] args) {
        int num = 4;

        Test.modificarVariable(num);

        System.out.println(num);

    }
}