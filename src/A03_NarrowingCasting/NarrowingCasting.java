package A03_NarrowingCasting;

public class NarrowingCasting {


    //    Narrowing Casting (manually) - converting a larger type to a smaller size type
    //    double -> float -> long -> int -> char -> short -> byte
    public static void main(String[] args) {

        double decimal = 1.3;
        int number = (int) decimal;
        System.out.println(decimal);
        System.out.println(number);

        int a = 12;
        byte b =(byte) a;
        System.out.println(a);
        System.out.println(b);

    }
}
