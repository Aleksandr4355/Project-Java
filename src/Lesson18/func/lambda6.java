package Lesson18.func;

import java.util.function.UnaryOperator;

public class lambda6 {
    public static void main(String[] args) {
        UnaryOperator <Integer> square = x -> x*x;
        System.out.println(square.apply(5));

        UnaryOperator<String> ou = s -> s.toUpperCase();
        System.out.println(ou.apply("Java code"));
    }
}
