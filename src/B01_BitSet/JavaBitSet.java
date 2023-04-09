package B01_BitSet;

import org.junit.Assert;

import java.util.BitSet;

public class JavaBitSet {

    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(10);                 // set one bit
        Assert.assertTrue(bitSet.get(10));      // ok

        bitSet.set(20,30);              // set the bits in the range from 20 to 30
        for(int i=20; i<30;i++){
            Assert.assertTrue(bitSet.get(i));   //ok
        }
        Assert.assertTrue(bitSet.get(30));  //fail
    }
}
