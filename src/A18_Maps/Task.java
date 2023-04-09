package A18_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task {

    public static void main(String[] args) {
        HashMap<Integer, String > colourMap =  getColourMap("Red", "Yellow", "Green", "Blue", "Cyan");
        System.out.println(colourMap);
        System.out.println(hasKey(colourMap, 2));
        System.out.println(hasValue(colourMap, "Red"));
        printColors(colourMap);
    }

    public static HashMap<Integer, String > getColourMap(String... colours){
        /*
         * This method returns colours with order numbers
         */
        HashMap<Integer, String > result = new HashMap<>();
        for (int i = 0; i <colours.length ; i++) {
            result.put(i+1, colours[i]);
        }
        return result;
    }

    public static boolean hasKey(HashMap<Integer, String> map, Integer key){
        /*
         * This method to check if key present/exist in map.
         */
        return map.containsKey(key);
    }

    public static boolean hasValue(HashMap<Integer, String> map, String value){
        /*
         * This method to check if value present/exist in map.
         */
        boolean check=false;
        Set<Map.Entry<Integer, String >> entries = map.entrySet();
        for(Map.Entry<Integer, String > row: entries){
           check =  (value == row.getValue()) ?  true :false;
        }
        return check;
        // return map.containsValue(value);
    }

    public static void printColors(HashMap<Integer, String> map){

        System.out.println(map.values());

    }




}
