package Lesson17;

import org.w3c.dom.ls.LSOutput;

interface StringFunc {
    String func(String n);
}

public class Sample7 {
    public static void main(String[] args) {
        String inStr = "Лямда выражения в java";
        System.out.println("Исходная строка: " + inStr);
        String outStr = stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Измененная строка в вверхнем регистре: " + outStr);

        StringFunc reverse  = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return  result;
        };
        System.out.println("Развернутая строка: " + stringOp(reverse,inStr));
    }

    static String stringOp(StringFunc sf, String s) {

        return sf.func(s);

    }
}
