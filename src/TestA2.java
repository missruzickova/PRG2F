import java.util.Random;
import java.util.Scanner;

public class TestA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //priklad 1 (bezecky zavod - méně než 100 kg)

        System.out.println("Jaká je tvá váha?");

        int hmotnost = sc.nextInt();

        if (hmotnost <= 100) {
            System.out.println("Můžete běžet v závodě.");
        } else {
            System.out.println("Nemůžete běžet v závodě");
        }


        //priklad 2

        Random rng = new Random();
        int Hodminci1 = rng.nextInt(0, 2);
        int Hodminci2 = rng.nextInt(0, 2);
        int Hodminci3 = rng.nextInt(0, 2);


        // 0
        if (Hodminci1 == 0 && Hodminci2 == 0 || Hodminci2 == 0 && Hodminci3 == 0 || Hodminci1 == 0 && Hodminci3 == 0) {
            System.out.println("Vyhrál jsi");
        } else {
            System.out.println("Prohrál jsi");
        }

        //priklad 3
        int voda1 = 2;
        double voda2 = 1.8;
        double voda3 = 1.5;
        double voda4 = 1.2;

        System.out.println("Kolik máš spotřebu vody za měsíc?");
        int voda = sc.nextInt();
        if (voda <= 1000) {
            System.out.println("Vaše cena:" + voda1 * voda);
        } else if (voda <= 5000) {
            System.out.println("Vaše cena:" + voda2 * voda);
        } else if (voda <= 10000) {
            System.out.println("Vaše cena:" + voda3 * voda);
        } else {
            System.out.println("Vaše cena:" + voda4 * voda);

        }


    }
}
