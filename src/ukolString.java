import java.util.Scanner;

public class ukolString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Zadej jméno");
        String jmeno = sc.next();

        System.out.println("Zadej příjmení");
        String prijmeni = sc.next();

        String obracenejmeno = "";
        String obraceneprijmeni = "";

        for (int i = jmeno.length() - 1; i >= 0; i--) {
            obracenejmeno += jmeno.charAt(i);

        }

        for (int i = prijmeni.length() - 1; i >= 0; i--) {
            obraceneprijmeni += prijmeni.charAt(i);
        }

        System.out.println("Jméno a příjmení pozpátku: " + obracenejmeno.toUpperCase() + " " + obraceneprijmeni.toUpperCase());


    }
}

