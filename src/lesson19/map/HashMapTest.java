package lesson19.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(334455,"Михаил Борисов");
        map1.put(3778899,"Ринат Зуев");
        map1.put(443366,"Роман Свиридов");
        map1.put(225577,"Анна Полякова");
        map1.put(884466,"Анна Полякова");
        map1.put(334455,"Ирина Мельник");
        map1.put(null,"Виктор Водник");
        map1.put(225544,null);

        System.out.println(map1);
        System.out.println(map1.get(334455));
//        map1.remove(443366);
        System.out.println(map1);
        System.out.println(map1.containsValue("Анна Полякова"));
        System.out.println(map1.containsKey(884466));
        System.out.println(map1.keySet());
        System.out.println(map1.values());


    }
}
