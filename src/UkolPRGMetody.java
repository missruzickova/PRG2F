public class UkolPRGMetody {

    static void validatePassword(String password){

        Boolean podminky = true;

        //DÉLKA = VĚTŠÍ NEZ 8
        if (password.length()<8){
            System.out.println("Heslo nesplňuje jednu z podmínek: délka");
            podminky = false;
        }
        //nesmí obsahovat slovo heslo
        else if (password.toLowerCase().contains("heslo")){
            System.out.println("Heslo nesplňuje jednu z podmínek: obsahuje zakázané slovo");
            podminky = false;
        }
        //heslo nesmí být delší neý 24 znaků
        else if(password.length()>24){
            System.out.println("Heslo neplňuje jednu z podmínek: maximální délka");
            podminky = false;
        }
        else {
            podminky = true;
            System.out.println("Heslo je v pořádku");
        }
    }

    public static void main(String[] args){

        validatePassword("kocka");
        validatePassword("tvojeHesloJEspatny");
        validatePassword("mnaumnaumnaumnaumnaumnaumnau");
        validatePassword("hafhafhaf");
    }
}
