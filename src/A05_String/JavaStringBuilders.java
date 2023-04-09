package A05_String;

public class JavaStringBuilders {
    // String degistirilemez (Yeni java da artik degistiriliyor asagida denedik ama yeni kopyasi hafizada olusturuluyor diyorlar)
    // ama StringBuilder olarak tanimlanan variabller degistirilebilir yeni kopya olusturulmaz boylece hafiza tasarruf edilir.

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();

        str.append(" Nasilsin?");
        str.append(" iyimisin");
        str.append(" abi.");

        System.out.println(str);

        String str2 = new String();
        str2 = "Hallo ";
        str2 += "Ali";              // builds new object
        System.out.println(str2);
        str2 = "nasil";               // builds new object
        System.out.println(str2);


    }
}
