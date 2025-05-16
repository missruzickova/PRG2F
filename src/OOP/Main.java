package OOP;

public class Main {

    public static void main(String[] args) {
        /* Clovek kralHandrich = new Clovek(5);

        // kralHandrich.velikostPalceUNohy = 1;

        Clovek augustin = new Clovek(6);
        // augustin.velikostPalceUNohy = 10.01;

        System.out.println(kralHandrich.velikostPalceUNohy);
        System.out.println(augustin.velikostPalceUNohy);

        Kniha k = new Kniha();
        k.nazevKnihy = "Zločin a Trest";
        k.autor = "Dostojevskij";

        k.vypisInfo();



        Kruznice l = new Kruznice();

        l.polomer = 3;

        l.obvod();
        l.obsah();
        */


        Kruznice kruznice = new Kruznice(); // vytvoření prázdného objektu

        kruznice.setPolomer(-7.5); // Hodnota předaná setteru je neplatná => nenastaví se

        kruznice.setPolomer(12.7);
        double polomerKruznice = kruznice.getPolomer();

        // Vypíše se: Hodnota polomeru kruznice je: 12.7
        System.out.println("Hodnota polomeru kruznice je: " + polomerKruznice);
    }
}
