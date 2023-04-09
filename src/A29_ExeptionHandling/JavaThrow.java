package A29_ExeptionHandling;

public class JavaThrow {
    // Java'da checked veya unchecked istisnayı throw anahtar sözcüğüyle atabiliriz.
    // Throw anahtar kelimesi çoğunlukla özel istisna atmak için kullanılır.
    // Burada kendimiz bir exeption olusturduk. Main blogunda bu hata meydana gelecek bir sey olursa diye try blogu ilede
            // bu hata tipini (handle) isledik.
    // Iyi de bunu if blogu ile cozebilecekken nicin boyle ugrasiyoruz? Bu sekilde hatalari bir yere kaydedip, yazdigimiz
    // program kullanilirken ne tip sorunlar olustugunu inceleyebilir ve cagreler üretebiliriz.
    static void validate(int age){
        if(age<18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }


    public static void main(String args[]){

        try{

            validate(13);

        } catch (ArithmeticException e){

            System.out.println("Sorun cikarma kardesim. :" + e.getMessage()); // sadece e yazarsan hem mesaji mem hata tipini basar

//             e.printStackTrace();  // bu kod aktif ise program tamamlandiktan sonra birde hata hakkinda bilgiler ekrana basilir.

        }

        System.out.println("rest of the code...");

    }
}
