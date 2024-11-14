import java.util.Scanner;

public class supl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        for (int i = 20; i >= 0; i -= 2) {
            System.out.println(i);
        }

         */

        System.out.println("toto je příklad na cyklus \"FOR\"");

        int radky = 4;
        int sloupce = 3;
        int x = 1;

        for (int i = 1; i <= radky; i++) {
            for (int j = 1; j <= sloupce; j++) {
                System.out.print(x+"\t");
                x++;
            }
            System.out.println();
        }

    }
}
