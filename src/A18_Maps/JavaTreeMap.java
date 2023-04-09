package A18_Maps;

import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Sari");
        map.put(102,"Yesil");
        map.put(101,"MAvi");        // keyleri siraya dizdigine dikkat edelim
        map.put(103,"Kirmizi");
        map.put(104,"");    // TreeMap 1 adet bos key alabilir

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(map);
    }
}
