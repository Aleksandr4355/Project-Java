package lesson19;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();
        stacks.add("alex");
        stacks.push("Katia");
        stacks.push("Victor");
        stacks.push("Vova");
        System.out.println(stacks);
//        stacks.remove(2);
//        System.out.println(stacks.pop());
        System.out.println(stacks);
    }
}
