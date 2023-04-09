package A40_Interfaces.InterfaceExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import java.util.TreeSet;

public class UsingSet {
    // Bu örnekte polymorphısm faydası gorünüyor
    // bu metodda diger Set turlerinin interface i olan Set kullaildigindan
    // bu metodu her turlu Seti print etmek icin kullanabiliriz.
    // bu metodda Set yerine HashSet yazsa idik asagida TreeSet i print edemezdik.
    public static void printSet(Set<Integer> set){

        for(Integer n : set){

            System.out.println(n + " ");

        }

    }

    public static void main(String[] args) {

        HashSet hashSet = new HashSet(Arrays.asList(2,1,3));
        System.out.println("hashSet"+ hashSet);
        printSet(hashSet);

        System.out.println("----------------------------------");
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(4,3,2));
        System.out.println("treeSet" + treeSet);
        printSet(treeSet);

    }
}
