package programacion.unidad_dos_ejercicios;

public class Bloques {

    // 1. bloques estáticos , (se ejecuta el primero , 1 vez al cargarse)
    static {
        System.out.println("Bloque estático");
    }
    // 2. bloque de iniciación (se ejecuta el segundo, cada vez que se crea un
    // objeto)
    {
        System.out.println("Bloque de iniciación");
    }

    // 3. bloque constructor (se ejecuta el 3ro despues del bloque de iniciación)
    public Bloques() {
        System.out.println("Constructor");
    }

    // 4. Método principal
    public static void main(String[] args) {
        System.out.println("Metodo principal");
        Bloques ejemplo = new Bloques();
        System.out.println(ejemplo);
    }
}