package VzorovyTest;

public class Závod {

    String mistoKonani;

    private int rok;
    private int mesic;
    private int den;

    public void printInfo(){
        System.out.println("Závod se koná " + den + "." + mesic + "." + rok + ".," + mistoKonani);
    }

    //konstruktor o přetížení
    public Závod(String mistoKonani, int rok, int mesic, int den){
        this.mistoKonani = mistoKonani;
        this.rok = rok;
        this.mesic = mesic;
        this.den = den;
    }
    public Závod(int den, int mesic, int rok, String mistoKonani){
        this.mistoKonani = mistoKonani;
        this.rok = rok;
        this.mesic = mesic;
        this.den = den;
    }

    // alt + insert
    public void setRok(int rok) {
        if (rok > 2024) {
            this.rok = rok;
        }
    }

    public void setMesic(int mesic) {
        if (mesic > 5) {
            this.mesic = mesic;
        }
    }

    public void setDen(int den) {
        if (den > 26) {
            this.den = den;
        }
    }
}
