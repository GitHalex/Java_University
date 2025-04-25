package capitulo_10;

public class Rain {
    public static void main(String[] args) {
        double abril = 12, mayo = 14, june = 8;

        double total = (abril + mayo + june)/3;

        System.out.println("Luvias para el \t" + abril + " de abril");
        System.out.println("Luvias para el \t" + mayo + " de mayo");
        System.out.println("Luvias para el \t" + june + " de junio");
        System.out.println("precipitacion media: " + total);

        System.out.println("###############Trigonometria################");
        double radianes = 0.5636;

        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);
        double suma = seno*seno + coseno*seno;
        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
        System.out.println("Suma de cuadrados: " + suma);

    }
}
