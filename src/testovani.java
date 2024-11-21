import java.util.Scanner;

public class testovani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int velikostMrizky = 8;
        int ctverec = 0;

        //shift + f6 změní všechny proměnné a mohou se přepsat najednou
        for (int radek = 0; radek < velikostMrizky; radek++) {
            for (int sloupec = 0; sloupec < velikostMrizky; sloupec++) {
                if (radek % 2 == 0 && sloupec % 2 != 0 || radek % != 0 && sloupec % 2 == 0) {
                    System.out.print(" ■ ");
                }
                else {
                    System.out.print("0");
                }
                System.out.println();
            }

