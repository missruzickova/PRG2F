import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ruskaruleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        //hod kostkou, kolikrát umřu při pokusu 100
        Random rng = new Random();
        int dead = 13;
        int hod = -1;
        int pocetSmrti = 0;
        int pocetHodu = 100;


        for (int i = 1; i <= 10; i++) {
            hod = rng.nextInt(1,21);

            if (hod == dead) {
                pocetSmrti++;
            }
        }

        System.out.println("Počet smrtí je: " + pocetSmrti);
        System.out.println("Počet smrtí v procentech " + ((pocetSmrti * 100)/pocetHodu) + "%");

         */

        //hod mincí v kolika procentech padla hlava
        Random rng = new Random();
        int hlava = 1;
        int hod = -1;
        int pocetHlav = 0;
        int pocetHodu = 1_000_000;


        for (int i = 1; i <= pocetHodu; i++) {
            hod = rng.nextInt(0,2);

            if (hod == hlava) {
                pocetHlav++;
            }
        }
        System.out.println("Počet hlav v procentech " + ((pocetHlav * 100)/pocetHodu) + "%");
    }
}
