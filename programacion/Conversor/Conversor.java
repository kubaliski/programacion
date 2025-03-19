package programacion.Conversor;

public class Conversor {

    public static double metrosAPies(double metros) {
        double metroEnPies = 3.28084;

        return metros * metroEnPies;
    }

    public static double piesAMetros(double pies) {
        double piesEnMetros = 0.3048;

        return pies * piesEnMetros;

    }
}
