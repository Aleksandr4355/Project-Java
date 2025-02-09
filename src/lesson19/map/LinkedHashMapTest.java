package lesson19.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put(1,"obj1");
        linkedHashMap.put(15,"obj1");
        linkedHashMap.put(4,"obj1");
        linkedHashMap.put(38,"obj1");
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(4));
        System.out.println(linkedHashMap.get(1));
        System.out.println(linkedHashMap);

    }
}
