package Extra;

import java.util.Arrays;

public class TaskAnagram {
    static boolean isAnagram(String a, String b) {
        // non case-sensitive
        a=a.toLowerCase();
        b=b.toLowerCase();

        // Convert input strings to character arrays
        char aArray[] = a.toCharArray();
        char bArray[] = b.toCharArray();

        // Sort temp arrays
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        // Returning new sorted string
        a = new String(aArray);
        b = new String(bArray);

        return a.equals(b);
    }

    public static void main(String[] args) {
        boolean anagram = isAnagram("anagram", "Margana");

        System.out.println(anagram);
    }
}
