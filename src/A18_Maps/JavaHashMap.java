package A18_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();
        map.put("Kemal", 5000d);
        map.put("Ali", 6000d);
        map.put("Huseyin", 4500d);
//        map.put("Bos",""); // HashMap bos key alamaz.
        System.out.println(map);

        HashMap<String, Double> map2 = new HashMap<>();

        map2.putAll(map);

        map.remove("Ali");
        System.out.println("Ali removed from map :" + map);

        Double salary = map2.get("Kemal");
        System.out.println("Get Kemal's salary :" + salary);

        boolean check = map.containsKey("Ali");
        System.out.println("Check Ali in map :" + check);

        Set<String> keys = map.keySet();
        System.out.println("Keys of map are " + keys);

        //////////////////////////////////////////////
        //for dongusu icin ozel iterator soyle kullanilir.
        Set<Map.Entry<String, Double>> entries = map2.entrySet();
        for(Map.Entry<String,Double> row: entries){  // for(Map.Entry row: entries) seklinde de oluyor.

            String key = row.getKey();
            Double value = row.getValue();

            System.out.println("Key :" + key + " Value :" + value);
        }
        /////////////////////////////////////////////////

        map.replace("Ali", 100000d);

        System.out.println("Ali's value tryed to change but..." + map);
        System.out.println("It's empty because there is no Ali in the map");

    }

}
