package Lesson1;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println();
//        System.out.println("привет");
//        System.out.print("hello");
//        System.out.print("world");
//        int a; // оюъявление переменной
//        a = 10; // присвоение значения
//        System.out.println("a=" + a);
//
//        int b = 20; // инициализация переменной
//        System.out.println("b=" + b);
//
//        int c, d;
//        c = 5;
//        d = 6;
//        System.out.println("c=" + c);
//        System.out.println("d=" + d);
//
//        int e = 50, f = 100;
//        System.out.println("e=" + e);
//        System.out.println("f=" + f);
//        int a = 10;
//        System.out.println(a);
//        a = 20;
//        System.out.println(a);
//        final int WEEK = 7;
//        System.out.println("WEEK" + WEEK);
//        final int WEEK;
//        WEEK = 7;
//        System.out.println("WEEK=" + WEEK);
//        boolean flag = true; // true/false
//        System.out.println(flag);
//        System.out.println(true);
//        System.out.println(false);
//        System.out.println(Boolean.TRUE);
//        System.out.println(Boolean.FALSE);
//        char ch = '*';
//        System.out.println("ch=" + ch);
//        char ch1 = 64;
//        System.out.println(ch1);
//        System.out.println(Character.SIZE);
//        System.out.println(Character.BYTES)
//        byte a = 127;
//        System.out.println(a);
//        System.out.println(Byte.SIZE);
//        System.out.println(Byte.BYTES);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//        short a = 3;
//        System.out.println(a);
//        System.out.println("Hello" + "" + "World"); // конкатенация
//
//        System.out.println("Переменная типа int заниемает " + Integer.BYTES + " Байт памяти (" + Integer.SIZE + " бит памяти)," + " и принимает занчение в диапозоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE );
//        long a = 8;
//        System.out.println(a);

//        float a = 8.5f;
//        double b = 8.5;
//        System.out.println(a);
//        System.out.println(b);
//        int a = 1, b = 2, c;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//         c=a; // c = 1
//         a=b; // a = 2
//         b=c; // b = c
//        System.out.println("a = " + a); // 2
//        System.out.println("b = " + b); // 1

//        int a = 1, b = 2;
//        a=a+b; // c = 1
//        b=a-b; // a = 2
//        a=a-b; // b = 1
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        int a = 512;
//        System.out.println(a);
//
//        System.out.println( ((Object) a ).getClass().getSimpleName());
//        int num16 = 0x12;
//        int num8 = 022;
//        int num2 = 0b10010;
//        System.out.println(num16);
//        System.out.println(num8);
//        System.out.println(num2);
//        num8 = num16 + num8;
//        System.out.println(num8);
//        int x = 123_456;
//        int y = 567_123__456;
//        double z = 234_567.789__102;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        double d1 = 0.512;
//        double d2 = .512;
//        double d3 = 512.;
//        double f1 = 0.512f;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
//        System.out.println(f1);
//        char ch1 = '+';
//        char ch2 = 43;
//        System.out.println(ch1);
//        System.out.println(ch2);
//
//        System.out.println(((Object)'+').getClass().getSimpleName());
//        String text = "He llo " +
//                "wor ld";
//        System.out.println(text);
//        System.out.println("Hello world!".getClass().getSimpleName());
//
//        String text1 = """
//             П  ри вет
//                              мир!!!
//             """;
//        System.out.println(text1);

//        int $number_1$ = 5;
//        int numberOne = 7;
//        System.out.println($number_1$);
//        System.out.println(numberOne);

//        var numberOne = "Hello";
//        System.out.println(numberOne);
//        System.out.println("Hello \n\"World!!!\"");
//        System.out.println("\tПуть к каталогу D:\\folder\\file.txt");
//        System.out.print("2 + 2 = 5");
//        System.out.print("\b");
//        System.out.print("4");
//        System.out.println("Преведущая строка");
//        System.out.print("Helo World");
//        System.out.print("\r");
//        System.out.print("Новый текст");
//        System.out.print("5 + 3 = ");
//        System.out.println(5 + 3);
        /*
        %n - перенос на другую строчку
        %d - для целочисленных значений (2)
        %f - для вывода вещественых чисел (2.6)
        %с - для вывода одиночного символа
        %s - длы вывода строчных значений
        */
//        double a = 5.2;
//        int b = 3;
//        System.out.printf("a = %f; b= %d", a, b);
//        String name = "Ирина";
//        int age = 25;
//        float height = 1.7f;
//        System.out.printf("Меня зовут %s. Мне %d лет. Мой рост %f%n", name, age, height);
//        System.out.printf("%8d%n",123); // _____123
//        System.out.printf("%4d%5d%n",123, 456); // _123__456
//        System.out.printf("%4d%n",123456789); // 123456789 не выравнивает так как символов много
//        System.out.printf("%6.2f%n",123.45); // 123.45
//        System.out.printf("%8.2f%n",123.45); // __123.45
//        System.out.printf("%-6s%5d5%n", "num =", 456); // num =___456
//        System.out.printf("--------------------------------%n");
//        System.out.printf("      JAVA PRIMITIVE TYPES      %n");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double", 64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long", 64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short", 16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte", 8);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char", 16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "boolean", "boolean", 1);
//        System.out.printf("--------------------------------%n");
//        System.out.println("Сумма: " + (5 + 2));
//        System.out.println("Разность: " + (5 - 2));
//        System.out.println("Произведение: " + 5 * 2);
//        System.out.println("Частное: " + 5 / 2);
//        System.out.println("Частное: " + 5 / 2.);
//        int a = 5;
//        int b = 2;
//        double c;
//        c = a / b;
//        System.out.println(c);
//        System.out.println(5 % 2);

//        int num = 4321;
//        int a, b, c ,d, res;
//        System.out.println("Исходное число: " + num);
//        a = num % 10;
//        System.out.println("a: " + a);
//        num = num / 10;
//        System.out.println("num: " + num);
//        b = num % 10;
//        System.out.println("b= " + b);
//        num = num / 10;
//        System.out.println("num: " + num);
//        c = num % 10;
//        System.out.println("c = " + c);
//        num = num / 10;
//        System.out.println("num: " + num);
//        d = num % 10;
//        System.out.println("d = " + d);
//        res = a * 1000 + b * 100 + c * 10 + d;
//        System.out.println("Обратное число: "res);

        /* унарные операторы
        ++ (инкремент), -- (дикремент)
        префиксная ++а
        постфиксная форма а++
        */

//         int a = 8;
//         a++; // a = 9
//        System.out.println(a);
//        int b = 8;
//        ++b; // b = 9
//        System.out.println(b);
//        int a = 8;
//        int b = ++a; // b = 9, a = 9
//        System.out.println(a); //9
//        System.out.println(b); //9
//        int a = 8;
//        int b = a++; // b = 8, a = 9
//        System.out.println(a); // 9
//        System.out.println(b); // 8

//        int a = 1;
//        int b = 1;
//        int c = a++ + 3; // c = 4, a=1, 1+3
//        int d = ++b + 3; // d = 5, b=2, 2+3
//        System.out.println(a); // 2
//        System.out.println(b); // 2
//        System.out.println(c); // 4
//        System.out.println(d); // 5

//        int a = 2;
//        int b = a++; // b=2
//        int c = b + 3 + a; // b=2, a=3
//        System.out.println(c); // 8

//        int a = 2;
//        int b = ++a; // b=2
//        int c = b + 3 + a; // b=2, a=3
//        System.out.println(c); // 9

//        int a = 1;
//        int b = 2;
//        int c = a + 5 * ++b; // c = 1+5*3
//        System.out.println(c); // 16

//        int a = 1;
//        int b = 2;
//        int c = (a + 5) * ++b; // c = (1+5)*3
//        System.out.println(c); // 18

        // Преоброзование базовых типов данных

//        int x = 5;
//        byte y = (byte) x; // явное преоброзование типа
//        System.out.println(y);
//        byte x = 5;
//        int y = x; // неявное преоброзование типа
//        System.out.println(y);
//        int x = 698867985;
//        float y = x;
//        System.out.println(y);
//        int x = 258;
//        byte y = (byte) x;
//        System.out.println(y);
//        long x = 5;
//        int y= (int) x;
//        System.out.println(y);
//        double x = 18.9845;
//        int y= (int) x;
//        System.out.println(y); // 18 дробная часть отбрасвается
//        double x = 18.9845;
//        int y= (int) Math.round(x); // Math.round() округляетс число
//        System.out.println(y); // 19 число округлино
//        int a = 5, b = 3, c = 7;
//        int sum = a + b + c;
//        System.out.println("Сумма = " + sum);
//        System.out.println("Произведение = " + a * b * c);
//        System.out.printf("Среднее арифметическое = %.2f", (double) (sum / 3));
//
//        int a = 5;
//        double b =4.7;
//        double c = a + b;
//        System.out.println(c);
//        int d = 'a' +3; // 97 + 3
//        System.out.println(d);

    }
}