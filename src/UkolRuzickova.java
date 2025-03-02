import java.util.Scanner;

public class UkolRuzickova {
    static class prezdivka{

        static String jmeno;
        static String prijmeni;

        static void ukol1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Napiš jméno");
            jmeno = sc.next();
            System.out.println("Napiš příjmení");
            prijmeni = sc.next();
        }

        static String nick;

        static void ukol2() {
            String nick1;
            if (jmeno.length() <= 4 ) {
                nick1 = jmeno;
            }else{
                nick1 = jmeno.substring(2 , 5);
            }
            String nick2;
            if (prijmeni.length() <= 3) {
                nick2 = prijmeni;
            } else{
                nick2 = prijmeni.substring(1 , 4);
            }

            nick = nick1.concat(nick2);
            nick = nick.toLowerCase();
        }

        static void zaJednicku(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Napiš rok svého narození");
            String datum = sc1.next();
            String cislo = datum.substring(2 , 4);
            nick = nick.concat(cislo);
        }

        static void ukol3() {
            if (nick.length() >= 5){
                System.out.println("Uživatelské jméno je správné");
            }else{
                System.out.println("Uživatelské jméno není dost dlouhé");
            }
            System.out.println(nick);
        }


    }

    public static void main(String[] args) {
        prezdivka.ukol1();
        prezdivka.ukol2();
        prezdivka.zaJednicku();
        prezdivka.ukol3();
    }
}

