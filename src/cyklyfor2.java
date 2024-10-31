import java.util.Scanner;

public class cyklyfor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        //vypiše čísla dokud jsou menší než "n"
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        */

        /*
        //sečte všechny kladná čísla co jsou menší než "n" a vypíše výsledek

        System.out.println("Zadej celé číslo");

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        System.out.println("Součet je : " + sum);

         */

        //vynásobí všechny kladná čísla co jsou menší než "n" a vypíše výsledek

        System.out.println("Zadej celé číslo");

        int n = sc.nextInt();
        int faktorial = 1;

        for (int i = n; i > 0; i--) {
            faktorial *= i;  // sum = sum * i

        }
        System.out.println("Faktoriál je : " + faktorial);



    }
}
