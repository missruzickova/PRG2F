import java.util.Scanner;

public class ucitelsevratil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velikostMrizky = 5;

        /*
        for (int radek = 0; radek < velikostMrizky; radek++) {
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {
                if (radek == sloupec) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" ■ ");
                }
            }
            System.out.println();
        }
        */

        /*
        for (int radek = 0; radek < velikostMrizky; radek++) {
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {
                if (radek == 0 || radek == velikostMrizky - 1) {    // nebo napsat → ||
                    System.out.print(" x ");
                } else {
                    System.out.print(" ■ ");
                }
            }
            System.out.println();
        }
    }

         */
        for (int radek = 0; radek < velikostMrizky; radek++) {
        for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {
            if (radek == 0 || radek == velikostMrizky - 1 || sloupec == 0 || sloupec == velikostMrizky - 1) {
                System.out.print(" x ");
            } else {
                System.out.print(" ■ ");
            }
        }
        System.out.println();
    }
}
}
