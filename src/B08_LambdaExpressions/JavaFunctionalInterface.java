package B08_LambdaExpressions;

/*
    Bu ornekte bir lambda function'un nasil olusturuldugunu ogreniyoruz.
    Lambda functionu olusturabilmek icin bir FunctionalInterface'e ihtiyacimiz var. Bu interface'in icersinde sadece bir
    adet abstract metodu olabilir. (SAM: Single abstract metod demektir.) Baska yeni uretilmis abstract metodu olamaz.
    Fakat istediginiz kadar default ve static metodlar olabilir. (hatirlarsan interface'lerde static ve
    default metodlarin body'si olabiliyordu.) Bunun yaninda FunctionalInterface'de daha onceden zaten var olan
    temel abstract metodlar olabilir. Mesela toString()abstract metodu gibi.

    Asagida ki ornekte FunctionalInterface kullanarak MathOperation adinda bir lambda fonksiyonu olusturuyoruz.
    Bu Interface icinde ki abstract metod diyor ki iki double parametra alirim ve geriye bir double retrun yaparim.
    Daha sonra bu olusturulan lambda fonksiyonu main icersinde istedigimiz gibi programliyoruz. Programlarken dikkat edecegimiz
    sey iki adet parametre ismi yazmak isterseniz type olarak double'da yazabilirsin ama gerek yok genelde yazilmaz. Sonra
    programin sonunda bir double return yapiyorsun. Sonra da urettigin bu lambda fonksiyonu kullaniyorsun. Asagida ayni
    labda funktionunun (MathOperation) main icersinde farkli sekillerde programlandigini ve kullanildigini goruyorsun.
    Asagida ayni zamanda lambda functionun bir metoda parametre olarak verilip kullanilmasina da ornek veriliyor

    Bunun yaninda java'da zaten uretilmis bazi lambda fonksiyonlari vardir ve bunlar direk programlanip kullanilabilir.
    Yani bunlar icin FunctionalInterface yazmak gerekmez. Mesela Consumer, Predicate, Supplier,... v.s.
 */

public class JavaFunctionalInterface {

    public static void main(String[] args) {

        // Lambdas überschreiben die einzige abstrakte Methode des FunctionalInterface
        MathOperation m1 = (a, b) -> a * b;
        System.out.println(m1.exec(10,15));

        // double exec(double a, double b);
        MathOperation m2 = (a, b) -> a + b;
        System.out.println(m2.exec(10,15));

        MathOperation m3 = (x, y) -> x - y;
        System.out.println(m3.exec(10,15));

        MathOperation m4 = (x, y) -> x * y * Math.PI;
        System.out.println(m4.exec(2,7));

        System.out.println();

        // Lamdas können als Parameter weitergegeben werden
        run(7,15, m4);

        System.out.println();
        // Lambda direkt übergeben
        run(7,15, (a, b) -> a * a * a * b * b); // Ausdruck im Lambda produziert automatisch ein return

        run(7,15, (a, b) -> {
            double sum = a + a + a;
            return sum + b;
        });

    }

    public static void run(double a, double b, MathOperation op) {
        System.out.println(op.exec(a,b));
    }
}

@FunctionalInterface // Annotation prüft, ob Voraussetzungen für ein SAM erfüllt sind
interface MathOperation {

    double exec(double a, double b);

    // double doSomething(double a, double b); // Im FunctionalInterface darf es nur eine abstrakte Methode geben

}