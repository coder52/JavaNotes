package A02_DataTypes;

import java.math.BigInteger;

public class Task2BigInteger {
    public static void main(String[] args) {
        String n1= "123456789123456789";
        String n2= "100000000000000000";

        BigInteger A = new BigInteger(n1);
        BigInteger B = new BigInteger(n2);
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));

        System.out.println(Long.MAX_VALUE);

    }
}
