import java.util.Random;
import java.util.Scanner;

public class Ukolzhodiny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej libovolné číslo");
        int a = sc.nextInt();

        if (a / 5 == 0) {
            System.out.println("Číslo není dělitelné 5");
        } else {
            System.out.println("Číslo je dělitelné 5");
        }

        System.out.println("Hod kostkou");

        Random rng = new Random();
        int Hodkostkou = rng.nextInt(1, 7);
        int Hodkostkou = rng.nextInt(1, 7);

        if (Hodkostkou + Hodkostkou == 10) {
            System.out.println("Vyhrál jsi");
        } else {
            System.out.println("Prohrál jsi");
        }
    }}



