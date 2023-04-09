package A17_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavatLinkedHashSet {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");

        TreeSet<String> treeSet = new TreeSet<>(); // dikkat burda harf siralamasina gore artan sirada diziyor.
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");


        //hashSet.remove("One");
        //linkedHashSet.remove("One");
        //treeSet.remove("One");

        String ch1 = accessElement(linkedHashSet, 2);
        String ch2 = accessElement(hashSet, 2);

        System.out.println("HashSet :" + hashSet);
        System.out.println("LinkedHashSet :" + linkedHashSet);
        System.out.println("TreeSet :" + treeSet);

        System.out.println(ch1);
        System.out.println(ch2);

    }


    public static String accessElement(Set<String> set, int idx) {
        String result = null;
        int count = 0;
        for (String ch : set) {
            if (idx == count) {
                result = ch;
                break;
            }
            count++;
        }
        return result;
    }
}