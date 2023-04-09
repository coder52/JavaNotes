package A17_Sets;

import java.util.HashSet;
import java.util.Set;

public class JavaSet3Methods {

    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        System.out.println("SetA :" + setA);

        Set<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        System.out.println("SetB :" + setB);


        setA.addAll(setB);
        System.out.println("(Union of A and B) :" + setA);

        setA.retainAll(setB);
        System.out.println("intersection of B and union of A and B :" + setA);

        setA.removeAll(setB);
        System.out.println("Difference between setA and intersection of B and union of A and B\n" + setA);

    }

}
