package A07_IfElseSwitchNested;

import java.util.Random;

public class JavaSwitchStatement {

    //switch
    /*SWITCH

        switch deyiminin kullanılmasının gerekli olacağı durumlardır.
        switch deyimi, tek bir ifadenin değerine göre sınırsız sayıda
         çalıştırma yolu belirlemeyi sağlayan bir komuttur.
        *
        switch: sözcüğünden hemen sonra gelen ifade parantez içinde
        yer almalı ve bir tamsayı ifade olmalıdır.
        case: anahtar sözcüklerini izleyen ifadeler tamsayı sabit türünde ifadeler olmalıdır,
        yani değişken içermemelidir.
        switch deyiminin çalışma prensibi basittir. switch ifadesi hangi case’i .
        izleyen sabitle çakışıyorsa, programın kontrolü o case’i izleyen kısma geçer.
         Bu case’den sonraki deyimler de kontrol edilmeden çalıştırılır.

        case sabitlerinden hiçbiri ifade ile uyuşmuyorsa, programın akışı default‘u izleyen kısıma geçer.
        (Bu kısım mevcutsa) default‘un en sonda olması şart değildir ama eger sonda degilse be break komutu da yoksa
        kendisinden sonra ki komutlar calisir.
         Fakat en sona koymak iyi bir programlama stilidir.

        İki case sabiti aynı değeri alamaz.

        Switch/case yapısında, programın kontrolünün ifadenin değerine göre case seçeneklerinden
        sadece birini çalıştırıp bundan sonra switch/case yapısını terketmesini isiyorsak
        bu durumda her case seçeneğinden sonra break komutu yerleştirmeliyiz.

     */

    public static void main(String[] args) {
        Random random = new Random();
        int day = 1 + random.nextInt( 7 ); //0 - 7

        System.out.println( "Your day is: " + day );

        switch(day) {
            case 1: // if day == 1
                System.out.println( "Monday" );
                break;
            case 2:// if day == 2
                System.out.println( "Tuesday" );
                break;
            case 3:// if day == 3
                System.out.println( "Wednesday" );
                break;
            case 4:// if day == 4
                System.out.println( "Thursday" );
                break;
            case 5:// if day == 5
                System.out.println( "Friday" );
                break;
            case 6:// if day == 6
                System.out.println( "Saturday" );
                break;
            case 7:// if day == 7
                System.out.println( "Sunday" );
                break;
            default:// else
                System.out.println( "not a valid day number" );
                break;

        }

    }

}
