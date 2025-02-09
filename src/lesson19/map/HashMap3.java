package lesson19.map;

import java.util.HashMap;
import java.util.Objects;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(new Key1("Виталий"), 20);
        map.put(new Key1("Александр"), 30);
        map.put(new Key1("Виталий"), 40);
        map.put(new Key1("Александра"), 25);

        System.out.println(map);
    }
}
class Key1{
    String key;

    public Key1(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        return key.equals(((Key1) o).key);
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0);
//        System.out.println("hash code: " + key + " = " + hash);
        return Objects.hashCode(key);
    }

    @Override
    public String toString() {
        return "Key1{" +
                "key='" + key + '\'' +
                '}';
    }
}