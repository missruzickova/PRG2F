import java.util.ArrayList;
import java.util.Scanner;

public class arayListEvidenceTrid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<ArrayList<String>> seznamTrid = new ArrayList<>();

        System.out.print("Zadejte počet tříd: ");
        int pocetTrid = sc.nextInt(); //3

        for (int i = 0; i < pocetTrid; i++) {
            seznamTrid.add(new ArrayList<>());

            System.out.println("Zadejte počet žáků v " + (i + 1) + ". třídě");
            int pocetZaku = sc.nextInt();
            System.out.println("Zadej jména žáků:");

            for (int j = 0; j < pocetZaku; j++) {
                String zak = sc.next();
                seznamTrid.get(i).add(zak);
            }
        }

        System.out.println("1. třída: " + seznamTrid.get(0));
        //seznamTrid.size(); || pocetTrid
    }
}
