package A24_Javac;


/*
    Asagida ki kodu command line uzerinde compile edebilmek icin
    * .jdk path uzerinde tanimlanmis olmali
    * cmd uzerinde ilgili dizine gelinmeli
    * javac JavaJavac.java  kodu yazilarak compile edilmelidir.
    * compile bitince JavaJavac.class gorunecektir.
    * bu file calistirmak icin ise once src dizinine geri dondum sonra
    * 'java day33JavacEnumReqursion.JavaJavac text'  yazdim calisti (text burada parametre)
    * nicin src dizinine donmeden direk day33JavacEnumReqursion dizini icinden calistiramadigimi anlamadim
 */

public class JavaJavac {
    public static void main(String[] args) {
        System.out.println(args[0]);

        for (int i = 0; i < args.length ; i++) {
            System.out.println(args[i]);
        }

    }
}

