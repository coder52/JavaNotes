package A25_Enum.ManuelValues;
// Kendimiz konstantlara value atamak istersek bir constructur tanimlamaliyiz. Asagida ki gibi.
// Asagida ki her bir constant Season enumini recursion yapiyor gibi dusun. Boylece value olarak parantez icinde ki rakami atiyor.
public class Ex4 {
    enum Season{
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);

        private int value;
        private Season(int value){ // enum'un constructoru zaten private'dir. Yazmaya gerek yok
            this.value=value;
        }
    }
    public static void main(String args[]){
        for (Season s : Season.values())
            System.out.println(s+" "+s.value);

        System.out.println(Season.FALL.value);
        System.out.println(Season.FALL.ordinal());
        System.out.println(Season.valueOf("WINTER"));
        System.out.println(Season.valueOf("WINTER").ordinal());

    }


}

