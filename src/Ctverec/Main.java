package Ctverec;

public class Main {

    public static void main(String[] args) {
        Ctverecek petr = new Ctverecek( value: 4.21);
        Ctverecek tvrdy = new Ctverecek( value: 1567.4);
        Ctverecek mekky = new Ctverecek( value: -12.345);

        System.out.println(petr.delkaStrany);
        System.out.println(tvrdy.delkaStrany);
        System.out.println(mekky.delkaStrany);

    }
}
