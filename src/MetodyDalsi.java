public class MetodyDalsi {

    static void print(String ngr){
        System.out.println(ngr);
    }

    static double sum(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        print("Ahoj metodo!");

        double vysledek = sum(5.6, 4.2); // 9.8
    }
}
