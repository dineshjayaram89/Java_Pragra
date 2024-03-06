package feb27;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String > map = new HashMap<>();
        map.put(1 , "a");
        map.put(2 , "b");
        map.put(3 , "b");
        map.put(4 , "d");
        System.out.println(map);
        System.out.println(map.containsKey(1));
        String string = map.get(2);
        Set<Integer> integers = map.keySet();
        map.clear();
        System.out.println(map);
    }
}
