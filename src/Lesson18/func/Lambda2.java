package Lesson18.func;

import java.util.function.Predicate;

public class Lambda2 {
    public static void main(String[] args) {
        Predicate<Integer> isSimple = num -> {
            if (num < 2) return false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Число простое: " + isSimple.test(7));
        System.out.println("Число простое: " + isSimple.test(12));
    }
}
