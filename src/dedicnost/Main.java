package dedicnost;

public class Main {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        v.move();
//        Car n = new Car();
//        n.move();
//        n.noise();
//        n.color = "indigo";
//
//        Vehicle noveAuto = new Car();

        Student pepik = new Student();
        pepik.name = "pepik";
        pepik.age = 76;
        pepik.chodiDoSkoly();
        pepik.school = "INFIS";
        pepik.chodiDoSkoly();
        pepik.introduce();

        System.out.println();
        System.out.println();

        Teacher Pop = new Teacher();
        Pop.name = "Mgr. Ladislav Pop";
        Pop.age = 40;
        Pop.predmet = "Anglický jazyk, Německý jazyk";
        Pop.ucit();
        Pop.introduce();
    }

}
