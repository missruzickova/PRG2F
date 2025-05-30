package OOP;

public class Kruznice {

    /*
    double polomer;

    public double obvod(){
        double obvod = 2 * Math.PI * polomer;

        System.out.println(obvod);
        return obvod;
    }

    public void obsah(){
        double obsah = Math.PI * polomer * polomer;

        */

    private double polomer;

    public double getPolomer() {
        return polomer;
    }

    public void setPolomer(double polomer){
        if(polomer < 0.0) {
            return;
        }

        this.polomer = polomer;
    }



}
