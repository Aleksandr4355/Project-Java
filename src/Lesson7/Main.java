package Lesson7;

public class Main {
    public static void main(String[] args) {

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

        String s = "я буду хорошим программистом";
        System.out.println(s);
        int [] result = new int ['я' - 'а' + 1];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println((char)(i+'а')+ "="+ result[i]);
        }
    }
}
