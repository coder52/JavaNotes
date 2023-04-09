package A03_NarrowingCasting;

public class casting {
    /*
     * Bir variable tipini daha dusuk seviyeli bir variable tipine cevirirken kullanilir
     * Kucukten buyuge cevirirken gerek yok cunki otomatik.
     */

    public static void main(String[] args) {

        int a = 100;
        float b= 1.8f;

        int c = (int)b;
        float d = a;

        System.out.println(c);
        System.out.println(d);

        int t= 10;
        float fl=21.22f;
        int xc= (int)fl;


        System.out.println("t is " + t);
        System.out.println("fl is " + fl);
        System.out.println("xc is " + xc);


    }

}
