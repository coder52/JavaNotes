package A30_Encapsulation.Task4SafeList;

import java.util.ArrayList;
import java.util.List;

public class MyNumbers {
    // Bu gorevde nasil guvenilir liste olusturacagimizi ogrenecegiz. Billindigi uzre listeler private oldugunda bile
    // icerigi degistirilebilir. Bu nedenle classimizda seter metodu olusturmadigimiz halde get metodunu kullanarak
    // listelere eleman ekleyebiliriz. Bu da guvenlik acigina sebep olacakir.
    // Bunu asmak icin getter icersinde listenin kopyasi alinir. Boylece orjinal liste cagirilan yerden degistirilemeaz.

    private List<Integer> evenNumbers;

    public MyNumbers(List<Integer> evenNumbers){
        this.evenNumbers=evenNumbers;
    }

    public List<Integer> getEvenNumbers(){
        List<Integer> aNewCopy = new ArrayList<>(evenNumbers);
        return aNewCopy;
//        return evenNumbers;
    }

    @Override
    public String toString() {
        return "day16Arrays.SecureArray.MyNumbers{" +
                "evenNumbers=" + evenNumbers +
                '}';
    }
}
