package TestA;

public class Teplomer {

    //1. ukol
    private String umisteni;
    private double teplota;
    private boolean vCelzii;


    //2. ukol
    public void printInfo() {
        if (vCelzii = true) {
            System.out.println("Teploměr: " + umisteni + "-" + teplota + "°C");
        }else System.out.println("Teploměr: " + umisteni + "-" + teplota + "°F");
    }

    public Teplomer(String umisteni, double teplota, boolean vCelzii) {
        this.umisteni = umisteni;
        this.teplota = teplota;
        this.vCelzii = vCelzii;
    }

    public Teplomer(String umisteni, double teplota) {
        this.umisteni = umisteni;
        this.teplota = teplota;
        vCelzii = true;
    }

    public double getTeplota() {
        if (teplota < 60 & teplota > - 50) {
            return teplota;
        }
        return 0;
    }



    public void setTeplota(double teplota) {
        this.teplota = teplota; {
        }
    }

    public String getUmisteni() {
        return umisteni;
    }

    public boolean getvCelzii() {
        return vCelzii;
    }
}

