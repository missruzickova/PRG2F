import java.util.Scanner;

public class hodinaSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nacti text od uzivatele, vypiš délu a všechny písmena velkými

        System.out.println("Napiš text");

        String slovo = sc.next();

        int pocetpismen = slovo.length();

        System.out.println(pocetpismen);

        System.out.println(slovo.toUpperCase());
    }
}
