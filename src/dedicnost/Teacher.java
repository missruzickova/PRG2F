package dedicnost;

public class Teacher extends Person{
    String predmet;
    public void ucit(){
        System.out.println("Učí na škole");
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("Učí na škole:" + predmet);

    }
}
