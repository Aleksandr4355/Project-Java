package lesson19.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Валентина");
        set.add("Гриша");
        set.add("Николай");
        set.add("Саша");
        set.add("Саша");
        System.out.println(set);
        set.add("Мария");
        System.out.println(set);
        for(String s: set){
            System.out.println(s);
        }
        set.remove("Саша");
        System.out.println(set);
        System.out.println(set.size());
    }
}
