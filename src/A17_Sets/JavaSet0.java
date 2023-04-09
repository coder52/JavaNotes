package A17_Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class JavaSet0 {

    public static void main(String[] args) {

        // List<Integer> arrayList = new ArrayList<>(); // Actually this is the best way
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(2);

        System.out.println("ArrayList " + arrayList);

        // Set<Integer> set = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        boolean add1 = set.add(1);
        boolean add2 = set.add(2);
        boolean add3 = set.add(3);
        boolean add4 = set.add(3);
        boolean add5 = set.add(2);

        System.out.println("set " + set);

        // easy method for adding ArrayList into HashSet
        HashSet<Integer> set1 = new HashSet<>(arrayList);
        System.out.println("set1" + set1);

    }

}
