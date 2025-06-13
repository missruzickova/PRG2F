package dedicnost;

public class Student extends Person{
    String school;
    public void chodiDoSkoly(){
        System.out.println("Chodí do školy");
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("Škola: " + school);
    }
}
