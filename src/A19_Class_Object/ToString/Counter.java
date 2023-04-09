package A19_Class_Object.ToString;

public class Counter {
// Counter class icinde ki static variable sayesinde bir classin kac defa cagirildigini anlayabiliyoruz
// Ayni zamanda class icinde ki to string methodunun ozelligini de goruyoruz. Yani direk instance ismi ile, toString()
// methodunda return yapilan texti print ettiriyor.

    static int count = 0;

    public Counter() {
        this.count++;
    }

    public String toString() {
        return "Counter :" + count;
    }
}
