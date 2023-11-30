package A29_ExeptionHandling.CustomExeption;

public class JavaCustomExeption {

    // Burda kendi olusturmus odugumuz KucukYasHatasi adinda ki hatayi isliyoruz.

    static void validate(int age)throws KucukYasHatasi{
        if(age<18)
            throw new KucukYasHatasi("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args){

        try{
            validate(13);
        }catch(KucukYasHatasi m){
            System.out.println("Exception occurred: "+m);
        }

        System.out.println("rest of the code...");
    }

}
