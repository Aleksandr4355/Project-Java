package lesson19.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
//        TreeMap<String, String> fileExtensions = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
//          TreeMap<String, String> fileExtensions = new TreeMap<>(String::compareTo);
          TreeMap<String, String> fileExtensions = new TreeMap<>();
//        TreeMap<String, String> fileExtensions = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        fileExtensions.put("Python", "*.py");
        fileExtensions.put("C++", "*.cpp");
        fileExtensions.put("JavaScript", "*.js");
        fileExtensions.put("Goland", "*.jo");
        fileExtensions.put("Java", "*.java");
        fileExtensions.put("java", "*.java");

        System.out.println(fileExtensions);
//        System.out.println(fileExtensions.get("Java"));
//        fileExtensions.remove("Goland");
//        System.out.println(fileExtensions);
//        System.out.println(fileExtensions.descendingMap());
//        System.out.println(fileExtensions);
//        System.out.println(fileExtensions.firstEntry());
//        System.out.println(fileExtensions.lastEntry());

    }
}
