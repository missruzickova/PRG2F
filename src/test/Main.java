package test;

public class Main {
    public static void main(String[] args) {
        KinoPředstavení film1 = new KinoPředstavení("Rychle a zběsile", 20, 50, 120, 300);

        film1.printInfo();
        System.out.println(film1.getVolnaMista());
    }
}
