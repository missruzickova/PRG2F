import java.util.Scanner;

public class cyklyFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //vypsat násobky s 5 od 1 do 1000
        /*
        //verze cyklus while

        int i = 1;
        while (i < 1000) {
            System.out.println(i);
            i += 5;
        }

         */

       /*
        //verze cyklus for

        for (int i = 0; i <= 1000; i += 5){
            System.out.println(i);
        }
        */


        /*
        //vypsat všechny čísla od 100 do 0

        for (int i = 100; i >= 0; i--){
            System.out.println(i);
        }
        */

        //aby vypisoval 2. mocninu čísel


        /*
        for (int i = 100; i >= 0; i--){
            System.out.println(i*i);
        }

         */

        //vypsat malou násobilku

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i * j + " ");
            }
            System.out.println();
        }
    }
}
