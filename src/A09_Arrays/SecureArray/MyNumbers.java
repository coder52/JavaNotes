package A09_Arrays.SecureArray;

import java.util.ArrayList;
import java.util.List;

public class MyNumbers {
    // Bu gorevde nasil guvenilir liste olusturacagimizi ogrenecegiz.
    // classimizda seter metodu olusturmadigimiz halde get metodunu kullanarak listelere eleman ekleyebiliriz.
    // bu da guvenlik acigina sebep olacakir.
    // Bunu asmak icin getter icersinde listenin kopyasi alinir. Boylece orjinal liste cagirilan yerden degistirilemeaz.

    private List<Integer> evenNumbers;

    public MyNumbers(List<Integer> evenNumbers){
        this.evenNumbers=evenNumbers;
    }

    public List<Integer> getEvenNumbers(){
        List<Integer> aNewCopy = new ArrayList<>(evenNumbers);
        return aNewCopy;
//        return evenNumbers;   // eger aNewCopy yerine bunu donderirsen yukarida anlatilan guvenlik acigi olusur
    }

    @Override
    public String toString() {
        return "day16Arrays.SecureArray.MyNumbers{" +
                "evenNumbers=" + evenNumbers +
                '}';
    }
}
