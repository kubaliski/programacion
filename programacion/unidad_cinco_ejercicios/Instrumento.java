package programacion.unidad_cinco_ejercicios;

abstract class Instrumento {
    protected String nombre;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    public abstract void tocar();

    static class Guitarra extends Instrumento {
        public Guitarra(String nombre) {
            super(nombre);
        }

        @Override
        public void tocar() {
            System.out.println("Tocando guitarra " + nombre);
        }
    }

    static class Piano extends Instrumento {
        public Piano(String nombre) {
            super(nombre);
        }

        @Override
        public void tocar() {
            System.out.println("Tocando piano: " + nombre);
        }
    }

    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[3];
        instrumentos[0] = new Guitarra("Guitarra clasica");
        instrumentos[1] = new Piano("Piano de cola");
        instrumentos[2] = new Guitarra("Guitarra electrica");

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}
