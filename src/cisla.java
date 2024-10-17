import java.util.Scanner;

public class cisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        //součet čísel

        int vstup;
        int suma = 0; //k tomuhle se budou přičítat čísla z cyklu

        do {
            //tady se opakuje
            System.out.println("Zadej číslo");
            //mačítání vstupu od uživatele
            vstup = sc.nextInt();
            suma = suma + vstup;
                //alternativa suma += vstup;

        } while (vstup != 0); //cyklus se dělá, dokud vstup není 0

        System.out.println("Součet je: " + suma);
        */

        /*
       //3 pokusy zadání pro haslo, pak se zablokuje
       //pokud se napíše špatgné heslo 3 => přístup zablokován, jinak => přístup povolen

       int heslo = 2411;
        int pokus = 0;

       while (pokus != 3) {
           pokus++;

           System.out.println("Zadejte heslo");
           int hesloOdUzivatele = sc.nextInt();

           if (heslo == hesloOdUzivatele) {
               System.out.println("Přístup povolen");
               return; //ukončí program před koncem
           }
       }
        System.out.println("Přístup zamítnut");


//           if (heslo == hesloOdUzivatele) {
//               System.out.println("Správné heslo, přístup povolen");
//           } else {
//               System.out.println("Špatné heslo, zkuste to znovu");
//           }

         */

        //počet sudých čísel
        //pokud zadá záporné číslo, program se ukončí a vypíše počet sudých čísel

        int cislo;
        int sudaCisla = 0;

        do {
            System.out.println("Napiš číslo: ");
            cislo = sc.nextInt();
            if (cislo % 2 == 0) {
                sudaCisla++;
            }
        }while (cislo >= 0);

        System.out.println("Počet sudých čísel:" + sudaCisla);

    }
}
