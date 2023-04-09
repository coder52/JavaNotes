package A19_Class_Object.ToString;

// Counter class icinde ki static variable sayesinde bir classin kac defa cagirildigini anlayabiliyoruz.
// Ayni zamanda class icinde ki to string methodunun ozelligini de goruyoruz. Yani direk print ettiriyor return
// yapilan texti.

public class StaticCounter {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(c1);

        Counter c3 = new Counter();
        System.out.println(c1);


    }
}
