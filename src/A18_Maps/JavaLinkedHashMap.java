package A18_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaLinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(100,"Sari");
        map.put(102,"Yesil");
        map.put(101,"Mavi");        // siraya dizmedigine dikkat ediniz
        map.put(103,"Kirmizi");
        map.put(104,"");    // LinkedHashMap 1 adet bos key alabilir

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(map);
    }
}
