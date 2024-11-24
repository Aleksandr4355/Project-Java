package Lesson7;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String str1 = "Hello";
//        String str2 = "World";
//        str2 = str2 + "!";
//        String message = str1 + " " + str2;
//        System.out.println(message);

//        char [] helloArray = {'П','р','и','в','е','т'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);

//        String str1 = "Hello";
//        int a = 5;
//        String message = str1 + " " + a;
//        System.out.println(message);

//        String str1 = "2";
//        int a = 5;
//        String message = str1 + a;
//        System.out.println(message);

//        int a = 5;
//        String message = "" + a;
//        System.out.println(message); // 5 - строка

//        String str1 = "2";
//        int a = 5;
//        int b = Integer.parseInt(str1); // преобразование строки в число
//        String message = str1 + a;
//        System.out.println(message); // 7

//        String str1 = "2";
//        int a = 5;
//        int message = Integer.parseInt(str1) + a;  // преобразование строки в число
//        System.out.println(message); // 7

//        String str1 = "Hello";
//        int count = str1.length(); // длина строки
//        System.out.println(count); //5

//        String str1 = "Hello";
//        int count = (str1 + 57).length(); // "Hello" + 57 =>"Hello57".length()
//        System.out.println(count); // 7

//        System.out.println(" ".length()); // пробел это символ

//        String name = "NiKita";
//        String name2 = name.toLowerCase(); // Преобразует имя в нижний регистр
//        System.out.println(name2);

//        String name = "NiKita";
//        System.out.println(name.toLowerCase()); // не перезаписывает переменную только ее выводит
//        System.out.println(name);

//        String name = "NiKita";
//        String name2 = name.toUpperCase(); // Преобразует имя в верхний регистр
//        System.out.println(name2);

//        String s = "Я буду хорошим программистом";
//        char res = s.charAt(7); // присваеваем значение по индексу
//        System.out.println(res);

//        String s = "я буду хорошим программистом";
//        System.out.println(s);
//        int [] result = new int ['я' - 'а' + 1];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(ch >= 'а' && ch <= 'я'){
//                result[ch - 'а']++;
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char)(i+'а')+ "="+ result[i]);
//        }

//        String s1 = "";
//        if(s1.isEmpty()) // s1.isEmpty() - проверки строки на наличие значений
//            System.out.println("Пустая строка");

//        String str1 = "Строка";
//        char[] res = str1.toCharArray(); // преоброзование строки в массив типа данных char
//        System.out.println("Массив символов: ");
//        for (int i = 0; i < res.length; i++) {
//            System.out.println("Элемент [" + i + "]: " + res[i]);
//        }

//        String path = "https://www.oracle.com/java/technologies/downloads/#jdk20-";
//        char[] chars = path.toCharArray(); // преоброзование строки в массив типа данных char
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == '/'){
//                chars[i] = '\\';
//            }
//        }
//        String res =  new String(chars);
//        System.out.println(res);

//        String str1 = "I learning Java";
//        System.out.println(str1);
//        System.out.println(str1.indexOf('a')); // находит первый найденый символ и останавливает поиск и выводит инжекс этого символа с начала строки
//        System.out.println(str1.lastIndexOf('a')); // находит первый найденый символ и останавливает поиск и выводит инжекс этого символа с конца строки
//        System.out.println(str1.indexOf('a',5)); // при постановки индекса начианет поиск с этого  идекса до конца строки
//        System.out.println(str1.lastIndexOf('a', 5)); // при постановки индекса начианет поиск с этого идекса до начало строки

//        System.out.println("   Hello World  ".trim()); // убирается с начала и сканца строки пробельные символы

//        System.out.println("I learning Java".substring(2,10)); // выводит строку с интервала идекс 2 до индекса 10
//        System.out.println("I learning Java".substring(2)); // выводит строку с интервала идекс 2 до конца строки

//        String str = "I learning Java";
//        String str1 = str.substring(2,10);
//        System.out.println(str1);

//        System.out.print("Введите два слова через пробел: ");
//        String str = input.next();
//        System.out.println(str.substring(str.indexOf(" ") + 1) + " " + str.substring(0,str.indexOf(" ")));

//        String str1 = "I learning Java";
//        String [] words = str1.split(" "); // массив разделяется по символу пробел
//        for(String word : words){
//            System.out.println(word);
//        }

//        System.out.print("Введите ФИО: ");
//        String str = input.nextLine();
//        String[] fio = str.split(" ");
//        System.out.println(Arrays.toString(fio));
//        System.out.println(fio[0] + " " + fio[1].substring(0, 1) + "." + fio[2].substring(0, 1) + ".");
//        System.out.println(fio[0] + " " + fio[1].charAt(0) + "." + fio[2].charAt(0) + ".");

//        String str = "Строка";
//        char[] res = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            res[i] = str.charAt(str.length() - 1 - i);
//        }
//        System.out.println(str);
//        System.out.println(res);

//        String str = "Строка";
//        String result = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            result += str.charAt(i);
//        }
//        System.out.println(result);

//        String str = "Строка";
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            result = str.charAt(i) + result;
//        }
//        System.out.println(result);

//        String res = String.join(":","00","23","30"); // позводяет обединить все символы через символ обьединитель
//        System.out.println(res); // 00:23:30

//        String[] text = new String[]{"Я", "буду", "хорошим", "программистом" };
//        String str = String.join(" && ", text);
//        System.out.println(str);

//        String text = "Я изучаю Java. Мне нравится Java.";
//        System.out.println(text);
//        String[] array = text.split("Java");
//        System.out.println(Arrays.toString(array));
//        String res = String.join("Android", array);
//        System.out.println(res);

//        String text = "Я изучаю Java. Мне нравится Java.";
//        text = text.replace("Java", "Android"); //поиск и замена слова на указаное
//        System.out.println(text);

//        String text = "Замените в этой строке все появления буквы 'о' на букву 'О', кроме первого и последнего вхождения";
//        String text2 = "";
//        char x;
//        int pos1 = text.indexOf('о');
//        int pos2 = text.lastIndexOf('о');
//        for (int i = 0; i < text.length(); i++) {
//            x = text.charAt(i);
//            if (x == 'о' && i != pos1 && i != pos2) {
//                x = 'О';
//            }
//            text2 += x;
//        }
//        System.out.println("Исходная строка -> " + text);
//        System.out.println("Результирующая -> " + text2);

//        String text = "Замените в этой строке все появления буквы 'о' на букву 'О', кроме первого и последнего вхождения";
//        String a = text.substring(0,text.indexOf("о") + 1);
//        System.out.println(a);
//        String b = text.substring(text.indexOf("o") + 1, text.lastIndexOf("о"));
//        System.out.println(b);
//        String c = text.substring(text.lastIndexOf("о"));
//        System.out.println(c);
//        System.out.println(a+b.replace("о", "О") + c);
// Сравнение строк
//        String a = "hello";
//        String b = "hello";
//        String c = "world";
//        String d = "HELLO";
//        System.out.println(a + " == " + b + " -> " + a.equals(b)); //позволяет сравнивать  строки в одном регистре
//        System.out.println(a + " == " + c + " -> " + a.equals(c));
//        System.out.println(a + " == " + d + " -> " + a.equalsIgnoreCase(d)); // сравнение строк без учета регистра

//        System.out.println("I learning Java".endsWith("Java")); // в конце строки
//        System.out.println("I learning Java".startsWith("I")); // в начале строки
//        System.out.println("I learning Java".contains("ing")); // ищет окончание

//        System.out.println("Введите название документа: ");
//        String path = input.nextLine();
//        if(path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png"))
//            System.out.println(" Это изображение");
//        else if (path.endsWith(".html"))
//            System.out.println("Это HTML-страница");
//        else if (path.endsWith(".doc") || path.endsWith(".docx"))
//            System.out.println("Это докумет Word");
//        else
//            System.out.println("Неизвестный формат");

//        String s = "I learning Java";
//        int n;
//        n = s.codePointAt(0); // позволяет получить код символа в строке по индексу
//        System.out.println(n);
//        n = s.codePointBefore(3); // позволяет найти код символа преведущего от указаного инжекса
//        System.out.println(n);

//        String s;
//        double d = 3.8596;
//        s = String.valueOf(d); // преобразуем тип данных в String
//        System.out.println(s);

//        String str = "1";
//        System.out.println("1 > 5 : " + str.compareTo("5")); //  отрицательное значение - 4 // сравнивает строк по коду символа
//        System.out.println("1 == 1 : " + str.compareTo("1")); // 0
//        str = "7";
//        System.out.println("7 > 5 : " + str.compareTo("5")); // 2

//        String str = "Привет";
//       System.out.println("Привет > привет : " + str.compareTo("привет")); // проверяет сравнение по символьно
//        System.out.println("Привет > привет : " + str.compareToIgnoreCase("привет")); // проверяет сравнение без учета регистра
//        String str = "a";
//        System.out.println("a > d : " + str.compareTo("d")); //  отрицательное значение - 4
//        System.out.println("a == a : " + str.compareTo("a")); // 0
//        str = "t";
//        System.out.println("t > d : " + str.compareTo("d")); // 2

//        String str = "11 23 44 55 23 22";
//        String str1 = "23";
//        String change = "!!!";
//        if (str.contains(str1)) {
//            str = str.replace(str1, change);
//            System.out.println(str);
//        }
    }
}
