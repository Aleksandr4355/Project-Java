package Lesson15.enum_primer;

import java.util.regex.Pattern;

enum RegEx {
    UPPER("[A-Z]+"),// шаблон регулярного выражения
    LOWER("[a-z]+"),
    NUMERIC("[+-]?[0-9]+");


    private final Pattern pattern;

    RegEx(final String pattern) { // конструктор преобразуют строку в регулярный шаблон выражения
        this.pattern = Pattern.compile(pattern);                                              
    }

    public boolean test (final  String input){
        return pattern.matcher(input).matches();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(RegEx.UPPER.test("ABC"));
        System.out.println(RegEx.LOWER.test("hello"));
        System.out.println(RegEx.NUMERIC.test("+7913"));

    }
}
