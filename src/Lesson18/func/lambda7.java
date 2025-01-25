package Lesson18.func;

import java.util.function.BinaryOperator;

public class lambda7 {
    public static void main(String[] args) {
        BinaryOperator<Integer> mul = (Integer x, Integer y)-> x*y;
        System.out.println(mul.apply(3,2));
        System.out.println(mul.apply(5,-2));
    }
}
