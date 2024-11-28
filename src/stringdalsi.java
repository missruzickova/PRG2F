import java.util.Scanner;

public class stringdalsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        String jmeno = "Pepa B";
        String prijmeni = "Skocdopole";
        prijmeni = prijmeni.replace("Skocd","Nejezchleba"); //změní část nebo celý string
        System.out.println(jmeno.charAt(5)); // řekne co je na tom čísle za písmeno

        System.out.println(jmeno.toLowerCase()); //vše na malý písmena

        System.out.println(jmeno.toUpperCase()); //vse na velý písmena

        System.out.println(jmeno.equals(prijmeni));

        System.out.println(jmeno.length()); //určí, jak dlouhé je slovo

        System.out.println(jmeno.indexOf("Pepa")); //řekne na jaké pozici je toto písmeno
        //začne se počítat od 0, takže by to vyhodilo 0, do tohohle písmena ' ' a do tohohle slova nebo tak " "

        System.out.println(jmeno.trim()); // odendá mezery na konci a na začátku

        System.out.println(jmeno.strip()); //odenda mezery na konci a na začátku

         */

        System.out.println("Napiš větu alespoň o dvou slovech");
        String veta = sc.nextLine();
        //Jak se nazývá hlavní město Zimbabwe? --zjistit jak je dlouhé první slovo
        veta.indexOf(' ');

        System.out.println("Délka prvního slova je:" + veta.indexOf(' '));

        int pocetslov = 1;

        sc.close(); //ukončí scanner
    }
}
