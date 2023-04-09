package B01_BitSet;

import java.util.BitSet;

public class sil {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(15, 25);

        bitSet.stream().forEach(System.out::println);

        System.out.println(bitSet.stream().count());
    }
}
