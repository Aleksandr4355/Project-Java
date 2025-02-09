package lesson19;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Alex");
        vector.add("Mixail");
        vector.add("Nikola");
        vector.add("Viktor");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(2));
    }
}
