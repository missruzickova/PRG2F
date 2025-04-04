package OOP;

public class Kruznice {

    double polomer;

    public double obvod(){
        double obvod = 2 * Math.PI * polomer;

        System.out.println(obvod);
        return obvod;
    }

    public double obsah(){
        double obsah = Math.PI * polomer * polomer;
    }

}
