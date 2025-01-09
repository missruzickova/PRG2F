import java.util.Scanner;

public class Metody {

    /*
    static double obvodtelesa(){
        int a =10;
        int b = 5;
        double c = Math.PI ;
        double obvod = a * b * c;

        return obvod; //nahoře je napsánodouble, tak se to tady musí vrátit, aby byl obvod tělěsa nějak vrácený
    }
     */

    static double nacticislo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číslo");
        double cislo = sc.nextDouble();

        return cislo;
    }

    public static void main(String[] args) {
        /*
        double vysledekMetody = obvodtelesa();
        System.out.println(obvodtelesa());
        */

        double vysledek = nacticislo();
        double csl = nacticislo() ;
        System.out.println(csl + vysledek);
    }
}
