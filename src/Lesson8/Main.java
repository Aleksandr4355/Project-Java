package Lesson8;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Регулярные выражения (regular expression)
//        String s = "Я ищу совпадения в 2024 году. И я их навйду в 2 счёта.5910. Hel_lo. Ели[-ели]";
//        String pattern = "[12][0-9][0-9][0-9]"; // [204] поиск символов по указаным симвалам в квадратных скобак // [0-9] поиск в диопозоне от 0 до 9
//        String pattern = "[A-Яа-яЁё\\[\\]-]"; // поиск спец символов путем экранирования
//        String pattern = "[A-Za-z]"; //
//        String pattern = "[^0-9]"; //
//        Pattern regex = Pattern.compile(pattern); // преобразует строку в шаблон, для работы с ней
//        Matcher matcher = regex.matcher(s); // использует шаблон regex для поиска в строке s
//        //       System.out.println(matcher.find());
//        while (matcher.find()) {
//            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1)); //
//            System.out.println(s.substring(matcher.start(), matcher.end()));
//            System.out.print(matcher.group() + " "); // выводит результат совпадения
//        }

//        String s = "Я ищу совпадения в 2024 году. И я их навйду в 2 счёта.5910. Hel_lo. Ели[-ели]. 2000000. 100000";
//        String pattern = "[12][0-9][0-9][0-9]"; // [204] поиск символов по указаным симвалам в квадратных скобак // [0-9] поиск в диопозоне от 0 до 9
//        String pattern = "[A-Яа-яЁё\\[\\]-]"; // поиск спец символов путем экранирования
//        String pattern = "[A-Za-z]"; // поиск букв алфавита от а до я
//        String pattern = "[^0-9]"; //
//        String pattern = "\\d"; //    поиск цифр 0 - 9
//        String pattern = "\\D"; //    поиск всего, кроме цифры
//        String pattern = "\\s"; //    поиск пробела
//        String pattern = "\\S"; //    поиск всего, кроме пробела
//        String pattern = "\\w"; //    [a-zA-Z0-9_]
//        String pattern = "\\W"; //    поиск всего, кроме [a-zA-Z0-9_]
//        String pattern = "\\АЯ ищу"; // поиск с начала строки
//        String pattern = "Ели\\[-ели\\].\\Z"; // поиск в конце строки
//        String pattern = "\\Bсовпадения"; // поиск в конце строки
//        String pattern = "\\d+"; //
//        String pattern = "20*"; //
//        Pattern regex = Pattern.compile(pattern); // преобразует строку в шаблон, для работы с ней
//        Matcher matcher = regex.matcher(s); // использует шаблон regex для поиска в строке s
//        while (matcher.find()) {
//            System.out.print(matcher.group() + " "); // выводит результат совпадения

//            String s = "Я ищу совпадения в 2024 году. И я их навйду в 2 счёта.5910. Hel_loWorld. Ели[-ели]. 2000000. 100000";
//            String s = "one\ntwo\none";
//            String s = "Goods = $500";
//            String s = "Java,\njava,\nJAVA";
//            String s = "<body>пример жадного соотвествия регулярных вырпавжений</body>";
//            String s = "Егоровна Алиса Александровна";
//            String pattern = "я";
//            String pattern = "\\d+ #поиск цифр";
//            String pattern = "one$";
//            String pattern = "$500";
//            String pattern = "(?mi)^java";
//            String pattern = "<.*?>";
//            String pattern = "А.+?а";
//            String pattern = "([a-z]+)(\\d)"; // разделения по группа 1 первая скобка, 2 скобка
//            Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//            Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS); // допускает коменты в шаблоне
//            Pattern regex = Pattern.compile(pattern, Pattern.DOTALL); // точка расматривается учитывает перенос на другую строку
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.group() + " "); //
//                System.out.println(matcher.group(1) + " "); //
//                System.out.println(matcher.group(2) + " "); //
//    }
//
//        String s = "Hello World";
//        String pattern = "(.(.(.))(.*))";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        matcher.find();
//        System.out.println(matcher.groupCount() + " ");
//        for (int i = 0; i < matcher.groupCount(); i++) {
//            System.out.println(i + " : " + matcher.group(i));
//        }

//        String s = "Ольга и Виталя отлично учаться";
//        String pattern = "Петр|Ольга|Виталя";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group() + " ");
//        }

//        String s = "int = 4, float = 4.0f, double = 8.0";
//        String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
////            System.out.println(matcher.group(1));
////            System.out.println(matcher.group(2));
//        }

//        String s = "192.168.255.255";
////        String s = "127.0.0.1";
////        String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
//        String pattern = "(\\d{1,3}\\.){3}\\d{1,3}";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        System.out.print("Введите дату dd-mm-yyyy: "); // 18-10-2024
//        String s = input.nextLine();
//        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());}

//        String s = "Я ищу совпадения в 2024 году. И я их навйду в 2 счёта.5910. Hel_loWorld. Ели[-ели]. 2000000. 100000";
//        String[] arr =  s.split("\\.");
//        System.out.println(Arrays.toString(arr));
//        for (String temp : arr){
//            System.out.println(temp);
//        }

//        String s = "Суворова Виктория, Россия, г. Сочи,     +7 999 555-77-33";
//        String[] arr =  s.split(",\\s*");
//        System.out.println(Arrays.toString(arr));
//        for (String temp : arr){
//            System.out.println(temp);
//        }
        String s = "05-03-1987 // Дата рождения";
        String s2 = s.replaceAll("\\s//.*","").replaceAll("-","\\.");
        System.out.println("Дата рождения: " + s2);




    }
}

