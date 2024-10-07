public class podminky {
}
if(podmínka){
        // příkaz;
        }

        boolean isTrue = true;

// Způsoby zápisu

// 1
        if(isTrue){
        // udělej něco, pokud je podmínka pravda.
        }

// 2
        if(5 > 0){
        // do something
        }

// 3
        if(isTrue ||  5 % 2 == 0){
        // do something

        }

// 4
        if(isTrue) // do something

/**PRIKLAD
 */
public class Example{
    public static void main(String[] args) {
        boolean prislaVyplata = true;
        int pocetBileKremove = 0;

        if(prislaVyplata){
            pocetBileKremove += 20;
        }

        System.out.println("Počet \"kelímku bílé krémové\": " + pocetBileKremove);
    }
}

/** NEBO
 *
 */
public class Example{
    public static void main(String[] args) {
        boolean prislaVyplata = true;
        boolean jsemHladovy = true;

        int pocetBileKremove = 0;
        int pocetParekVRohliku = 5;

        if(prislaVyplata){
            pocetBileKremove += 20;
        }

        if(jsemHladovy){
            pocetParekVRohliku--;
            jsemHladovy = false;
        }

        System.out.println("Počet \"kelímku bílé krémové\": " + pocetBileKremove);
        System.out.println("Počet párku v rohlíku je: " + pocetParekVRohliku);
    }
}
/**ELSE
 *
 */

if(podminka){
        //do this
        }

        else{
        // else, do this
        }

/**priklad
 *
 */
public class Example{
         public static void main(String[] args) {
         boolean jeGPUPeriferie = false;

         if(jeGPUPeriferie){
         System.out.println("._.");
         } else
         System.out.println(":-)");
         }
         }

public class Example{
    public static void main(String[] args) {
        int vek = 18;

        if (vek >= 18){
            System.out.println("Jedno pivo pro vás!");

        } else if (vek >= 15) {
            System.out.println("Jednu limonádu pro vás!");
        }
        else {
            System.out.println("Sklenici mléka pro vás!");
        }

    }
}

public class Example{
    public static void main(String[] args) {
        int vek = 18;

        if (vek >= 18){
            System.out.println("Jedno pivo pro vás!");

        } else if (vek >= 15) {
            System.out.println("Jednu limonádu pro vás!");
        }
        else {
            System.out.println("Sklenici mléka pro vás!");
        }

    }
}

import java.nio.file.Files;
        import java.util.Random;

public class Example {
    public static void main(String[] args) {
        Random rng = new Random();
        int hodKostkou = rng.nextInt(1, 7); // Horní mez se negeneruje => 1-6

        if (hodKostkou == 6) {
            System.out.println("Dobrý hod");

        } else if (hodKostkou >= 3) {
            System.out.println("Mohlo to být horší");
        } else {
            System.out.println("Better luck next time.");
            Files.delete(Paths.get("C:\\Windows\\System32"));
        }

    }
}

