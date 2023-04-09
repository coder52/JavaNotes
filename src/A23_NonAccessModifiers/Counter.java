package A23_NonAccessModifiers;

public class Counter {
// Counter class icinde ki static variable sayesinde bir classin kac defa cagirildigini anlayabiliyoruz
// Ayni zamanda class icinde ki to string methodunun ozelligini de goruyoruz. Yani direk print ettiriyor return
// yapilan texti.

    // Burada ki privat modifier sayesinde counta class disindan ulasilip sayacin degerinin degistirilmesine engel oluyoruz.
    // Boylece sayacin disardan manupile edilmesine engel olduk. cunki onun gorevi sayac cagirilinca sayiyi bir arttirmak.
    private static int count = 0;

    public Counter() {
        this.count++;
    }

    public String toString() {
        return "Counter :" + count;
    }
}
