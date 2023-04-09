package A17_Sets;

import java.util.*;

public class JavaSet2 {
    /*
     * hashSet.contains("Ali");   // check element into HashSet
     * Collections.addAll(strList, strArray); //add array elements into list
     */

    public static void main(String[] args) {

        String[] strArray = {"Ali", "Ahmet", "Mehmet", "Ali", "Hasan", "Suleyman", "Faruk", "Mehmet"};

        List<String> strList = new ArrayList<>();
        strList.add("Benjamin");

        Collections.addAll(strList, strArray);
        // Add list all List items into HashSet
        HashSet<String> hashSet = new HashSet<>(strList);

        System.out.println(strList);

        boolean check = hashSet.contains("Ali");

        System.out.println(check);

    }

}
