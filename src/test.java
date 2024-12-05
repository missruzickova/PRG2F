import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        /*
        String cislo = "123";
        int c = 53;

        String RRC = String.valueOf(c);   //retezovaReprezentaceCisla

        int CRR = Integer.parseInt(cislo); //ciselnaReprezentaceRetezce

        CRR = CRR + 15;
        System.out.println(CRR);

        Scanner sc = new Scanner(System.in);
        System.out.println("Prosím zadejte číslo:");
        String radka = sc.nextLine(); //nacte i slova po mezere dokud nezmacknu enter

        int CHR = Integer.parseInt(radka);   //ciselnaHodnotaRadky
        CHR += 10;
        System.out.println("Nové číslo: " + CHR);

        */

        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej větu: ");
        String veta = sc.nextLine();

        //java je jazyk
        String zacatekVety = "Java";
        String konecVety = "rocks.";

        System.out.println("Řetězec začíná na " + zacatekVety + ": " + veta.endsWith(konecVety));

        System.out.println("Řetězec končí na " + konecVety + ": " + veta.endsWith(konecVety));

        sc.close();

         */

        //SUBSTRING

        Scanner sc = new Scanner(System.in);

        //Načítání vstupu od uživatele
        System.out.println("Zadej větu: ");
        String veta = sc.nextLine();

        System.out.println("Zdejte začátek (index): ");
        int zacatek = sc.nextInt();
        System.out.println("Zdejte konec (index): ");
        int konec = sc.nextInt();
        //načteno

        //výpis
        System.out.println(veta.substring(zacatek, konec));


    }
}
