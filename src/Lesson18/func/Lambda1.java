package Lesson18.func;

import java.lang.classfile.constantpool.IntegerEntry;
import java.util.function.Predicate;

public class Lambda1 {
    public static void main(String[] args) {
//        Predicate<Integer> isPositive = x -> x > 0;
//        System.out.println(isPositive.test(5));
        Predicate <String> isPalindrome = str->{
//            str = str.toLowerCase();
            String reversed = new StringBuilder(str).reverse().toString().toLowerCase();
            return str.toLowerCase().equals(reversed);
        };
        String word1 = "Мадам";
        boolean res = isPalindrome.test(word1);
        System.out.println(word1 + "это поледнром" + res);
        String word2 = "радар";
        boolean res2 = isPalindrome.test(word2);
        System.out.println(word2 + "это поледнром " + res2);
    }
}
