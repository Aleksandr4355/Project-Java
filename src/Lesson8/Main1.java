package Lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main1 {
    public static void main(String[] args) {
//        String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15T21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15T01:09.";
//        String pattern = "[0-2][0-9]:[0-5][0-9]";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + " ");
//        }

//        try { // обработка ошибак в шаблоне
//            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15T21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15T01:09.";
//            String pattern = "[0-2][0-9]:[0-5][0-9";
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }
//        }catch (PatternSyntaxException pse){
//            System.out.println("Неправильное регулярное выражение: " + pse.getMessage()); // вывод ошибки сообщением
//            System.out.println("Описание: " + pse.getDescription()); // описание ошибки
//            System.out.println("Описание: " + pse.getIndex()); // показывает индекс на какой позиции находится ошибка
//            System.out.println("Неправильны шаблон: " + pse.getPattern()); // показывает строку где есть ошибка
//        }

//        String s = "Цыфры: 7, +17, -42, 0013, 0.3";
//        String pattern = "[+-]?[\\d.]+";
//        String pattern = "[+-]?\\d+\\.?\\d*";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        String s = "author=Пушкин А.С.; title  = Евгений Онегин; price =200; year= 1831;";
////        String pattern = "\\w+\\s*=\\s*[а-я0-9А-Я .]+";
//        String pattern = "\\w+\\s*=[^;]+";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        String s = "12 сентебря 2024 года";
//        String pattern = "\\d{2,4}"; // показывается повторение по 2 цифры в скобках указывается количество повторений
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 74994564578";
//        String pattern = "\\+?7\\d{10}";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        String s = "I learning Java Hello";
////        String pattern = "^\\w+\\s\\w+";
//        String pattern = "^\\w+\\s\\w+\\s\\w+\\s\\w+$";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        String s = "I learning Java Hello";
//        String pattern = "^\\w+\\s\\w+\\s\\w+\\s\\w+$";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        System.out.println(matcher.find());

        String s = "Java_master-12";
        String pattern = "^[\\w-]{3,16}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        System.out.println(matcher.find());

    }
}
