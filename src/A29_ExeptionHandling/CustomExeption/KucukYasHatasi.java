package A29_ExeptionHandling.CustomExeption;

// Burada kendi hata turumuzu Exeption sinifini miras alarak tanimladik.
// artik KucukYasHatasi adinda hata ismi kullanilabilir.

public class KucukYasHatasi extends Exception{

    KucukYasHatasi(String str){

        super(str);

    }

}
