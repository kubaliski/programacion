package programacion.unidad_dos_ejercicios;

public class Configuracion {
    public static final String NOMBRE_EMPRESA = "WedPlan ";
    public static final int MAX_PRODUCTOS = 12;
    public static final double TASA_CAMBIO = 1.2;

    // .2
    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, SABADO, DOMINGO;
    }

    public static void main(String[] args) {
        System.out.println(NOMBRE_EMPRESA);
        System.out.println(MAX_PRODUCTOS);
        System.out.println(TASA_CAMBIO);

        DiaSemana dia = DiaSemana.MIERCOLES;
        System.out.println(dia);
    }
}
