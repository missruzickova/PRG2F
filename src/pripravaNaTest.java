public class pripravaNaTest {

    //prvni cviceni

    private static int soucetCisel (int a, int b){
        return a + b;
    }

    //druhe cviceni

    private static boolean JeSude (int cislo) {
        return cislo % 2 == 0;
    }

    //treti cviceni

    private static String uvitaciZprava (String jmeno) {
        return "Ahoj" + jmeno + "vítej";
    }

    //ctvrte cviceni

    private static double mocnina(double a, double b){

        if (b == 0){
            return 1;
        }
        else if (b < 0) {
            return 1;
        }

        return a * mocnina(a, b - 1);

    }
}
