package test;

public class KinoPředstavení {
    // Atributy + zapouzdření (private)
    private String nazev;
    private int hodina;
    private int minuta;
    private int delkaMin;
    private int volnaMista;

    // 2. úkol - metoda
    public void printInfo() {
        System.out.println("KinoPředstavení: " + nazev + ", začátek " + hodina + ":" + minuta + ", délka " + delkaMin + " min, volno " + volnaMista + " míst");
    }

    // konstruktor
    public KinoPředstavení(String nazev, int hodina, int minuta, int delkaMin, int volnaMista) {
        this.nazev = nazev;
        this.hodina = hodina;
        this.minuta = minuta;
        this.delkaMin = delkaMin;
        this.volnaMista = volnaMista;
    }

    // přetížení konstruktoru
    public KinoPředstavení(String nazev, int hodina, int minuta, int delkaMin) {
        this.nazev = nazev;
        this.hodina = hodina;
        this.minuta = minuta;
        this.delkaMin = delkaMin;
        this.volnaMista = 100;
    }

    // getter volná místa
    public int getVolnaMista() {
        if (volnaMista < 200 & volnaMista > 0) {
            return volnaMista;
        }
        return 0;
    }

    // setter volná místa
    public void setVolnaMista(int volnaMista) {
        this.volnaMista = volnaMista;
    }

    // getter - název
    public String getNazev() {
        return nazev;
    }

    // getter hodina
    public int getHodina() {
        if (hodina < 23 & hodina > 0) {
            return hodina;
        }
        return 0;
    }

    // getter - minuta
    public int getMinuta() {
        if (minuta < 59 & minuta > 0) {
            return minuta;
        }
        return 0;
    }

    // getter delka
    public int getDelkaMin() {
        if (delkaMin > 0) {
            return delkaMin;
        }
        return 0;
    }

}