package A09_Arrays.SecureArray;

import java.util.ArrayList;
import java.util.List;

public class MyMath {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        MyNumbers evenNumbers = new MyNumbers(numbers);

        System.out.println(evenNumbers);
        evenNumbers.getEvenNumbers().add(100);          // eger day16Arrays.SecureArray.MyNumbers sinifi icinde getEvenNumbers() metodunda
        System.out.println(evenNumbers);                    // listeyi kopyalamadan return yaparsak bu islem basarili olur.
                                                                // Bu da guvenlik eksikligine sebep olur.

    }
}
