package lesson19.collection;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("red");
        states.add("blue");
        states.add("green");
        states.add("black");
        states.add("white");
        System.out.println(states);
        System.out.println(states.getFirst());
        System.out.println(states.getLast());
        System.out.println(states);
        while (states.peek() != null){
            System.out.println(states.poll());
        }
        System.out.println(states);
    }
}
