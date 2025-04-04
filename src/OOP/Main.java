package OOP;

public class Main {

    public static void main(String[] args) {
        Clovek kralHandrich = new Clovek(5);

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
    }
}
