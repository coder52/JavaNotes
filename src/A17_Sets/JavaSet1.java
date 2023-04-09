package A17_Sets;

import java.util.*;

public class JavaSet1 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        int[] arr = {1,2,3,4,5,6,7,8,1,2,3,0,5};

        for (int i = 0; i < arr.length ; i++) {
            set1.add(arr[i]);
        }
        // Convert set from ArrayList
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(2);
        Set<Integer> set11 = new HashSet<Integer>(arrList);
        System.out.println("arrList to set11:" + set11);

        System.out.println(set1);
        // add elements by method
        Set<Integer> set2 = new HashSet<>();
        addElement(set2, 1,2,3,4,4,5,3,5,6,2);
        System.out.println(set2);
    }

    public static void addElement(Set<Integer> set, Integer... elements){

        for (Integer element:elements) {

            set.add(element);

        }

    }

}
