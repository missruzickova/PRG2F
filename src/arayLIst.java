import java.util.ArrayList;

public class arayLIst {

    public static void main(String[] args) {
        ArrayList<String> Auta = new ArrayList<>();

        Auta.add("Škoda");
        Auta.add("Mercedes");
        Auta.add("Bugatti");
        Auta.add("BMW");
        Auta.add("Lancia");
        Auta.add("Audi");
        Auta.add("Volvo");
        Auta.add("Honda");

        System.out.println(Auta.get(0));

        System.out.println(Auta.size());
        boolean jeSmazano = Auta.remove("Škoda");
        System.out.println(Auta.size());
        System.out.println(jeSmazano);

        Auta.set(5, "Lamborghini");
        System.out.println(Auta.get(5));
        System.out.println(Auta);

}
}
