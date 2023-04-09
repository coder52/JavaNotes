package A19_Class_Object.JavaClass_Methods.StaticMethods;

// Static methodlar asagida da gorecegin gibi class orneklenmeden direk cagrilabilirler.
// fakat statik olmayan methodlar orneklenmeden cagrilamazlar
// python mantigiyla dusunursek; statik metodlar class methodu iken
// non static metodlar instance metodudur. (Tum ozellikleri ayni olmayabilir.)
// Statik anahtar kelime, sınıfın bir örneğinden çok sınıfa aittir. Sinif icinde ki Static bir metod ancak static
// variableleri cagirabilir.

public class StaticMethods {
    public static void main(String[] args) {

        int a = MyMath.abs1(-5);

        // MyMath.abs2(-5);  olmaz cunki abs2 static degil
        System.out.println(a);
        // yani soyle olur
        MyMath math = new MyMath();
        int i = math.abs2(-7);
        System.out.println(i);
    }
}
