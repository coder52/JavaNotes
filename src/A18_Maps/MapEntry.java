package A18_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntry {
    public static void main(String[]  args){
        HashMap<String, Double> map = new HashMap<>();
        map.put("Kemal", 5000d);
        map.put("Ali", 6000d);
        map.put("Huseyin", 4500d);

        //for dongusu icin ozel iterator soyle kullanilir.
//        Set<Map.Entry<String, Double>> entries = map.entrySet();
//        for(Map.Entry<String,Double> row: entries){  // for(Map.Entry row: entries) seklinde de oluyor.
        for(Map.Entry <String,Double> row:map.entrySet()){
            String key = row.getKey();
            Double value = row.getValue();

            System.out.println("Key :" + key + " Value :" + value);

        }
    }
}
