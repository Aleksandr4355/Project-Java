package Lesson5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = 5.66f;
//        System.out.println(Math.round(num)); // округляет значение по законам математики
//        System.out.println(Math.floor(num)); // округление в нижнию сторону
//        System.out.println(Math.ceil(num)); // округление вверхнию сторону
//        System.out.println(Math.sqrt(4)); // нахождение корня квадратного
//        System.out.println(Math.pow(4,2)); // возведение числа в степени
//        System.out.println(Math.PI);

//        System.out.print("Введите радиус окружности: ");
//        int radius = input.nextInt();
//        System.out.printf("Длина окружности: %.2f", 2 * Math.PI * radius);

//        int c;
//        System.out.print("Введите катит 1: ");
//        int a = input.nextInt();
//        System.out.print("Введите катит 2: ");
//        int b = input.nextInt();
//        System.out.println("Гипотенуза: " + Math.sqrt(Math.pow(a,2) *Math.pow(b,2)));

//        hello("Irina");
//        hello("Igor");

//        getSum(2,5);
//        int a = 1;
//        int b = 7;
//        getSum(a,b);
//        int n = 3;
//        int m = 6;
//        getSum(n,m);

//        symboLDraw(9, '+', '-');
//        symboLDraw(7, 'X', 'O');

//        int a = 30, b = 45;
//        System.out.println("Перед вызовом метода:\na = " + a + "\nb = " + b);
//        swapFunc(a, b);
//        System.out.println("После вызовом метода:\na = " + a + "\nb = " + b);

//        int a = 11;
//        int b = 6;
//        int c = min(a, b); // присвоить переменной значение вычисленое в методи min
//        System.out.println("Минимальное значение: " + c);

//        int a, b, c;
//        System.out.print("Ведите a: ");
//        a = input.nextInt();
//        System.out.print("Ведите b: ");
//        b = input.nextInt();
//        System.out.println("Результат " + operation(a,b));

//        int a = 5, b = 6;
//        int c = operation1(a, b);
//        System.out.println(c);

//        for (int i = 0; i < 11; i++) {
//            System.out.println(i + " в кубе = " + cub(i));
//        }

//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            printLine(1,i);
//        }
//        for (int i = n -1 ; i > 0; i--) {
//            printLine(1,i);
//        }

//        sum(1, 2, 3);
//        sum(1, 2, 3, 4, 5);
//        sum();

//        sum_str("Сумма двух чисел: ", 20, 30);
//        sum_str("Сумма двух чисел: ", 20, 10, 3);
//        sum_str("Сумма: ");

//        number(2, 7, 0, 3, 1, 5, -13);
//        number(2, 7, 0, 3, 1, 5, -13, 13);
//        number(26, 13);
//        number(99, 99, 100, 34, -39);
//        number(99, 39, 99, 100, 34);

//        System.out.println(ch(1,2,3,4,5,6,7,8,9));
//        System.out.println(ch(3,6,1,9,5));

//        int[] num1 = {3, 8, 9, 4, 1, 2, 5};
//        int[] num2 = {1, 2, 5};
//        System.out.println(max(num1));
//        System.out.println(max(num2));
    }

    public static void getSum(int a, int b) {
        System.out.print(a + b);
    }

    public static void hello(String name) {
        System.out.println("Hello" + name + "!");
    }

    public static void symboLDraw(int count, char a, char b) {
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0)
                System.out.print(a);
            else
                System.out.print(b);
        }
        System.out.println();
    }

    public static void swapFunc(int a, int b) {
        System.out.println("До замены:\na = " + a + "\nb = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("После замены:\na = " + a + "\nb = " + b);
    }

    public static int min(int n1, int n2) {
        int minCh;
        if (n1 > n2)
            minCh = n2;
        else
            minCh = n1;
        System.out.println("hello");
        return minCh; // возращается значение из метода
    }

    public static int operation(int a, int b) {
        int value;
        if (a > b)
            return a - b;
        else
            return a + b;
    }

    public static int operation1(int a, int b) {
        return a > b ? (a - b) : (a + b);
    }

    public static int cub(int a) {
        return a * a * a;
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sum(int... num) {
        int res = 0;
//        for (int n : num) {
//            res += n;
//        }
//        System.out.print(res + " ");
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.print(res + " ");
    }

    public static void sum_str(String messag, int... num) { // колкция должна стоять посленей позицией
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.print(messag);
        System.out.println(res);
    }

    public static void number(int... v) {
        int max = 0;
//        for (int j : v) {
//            if (j % 13 == 0 && j > 0 && max < j) {
//                max = j;
//            }
//        }
//        System.out.println(max == 0 ? "Число не найдено" : max);
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 13 == 0 && v[i] > 0 && max < v[i]) ;

        }
        System.out.println(max == 0 ? "Число не найдено" : max);
    }

    public static ArrayList ch(int... args) {
        ArrayList<Integer> mas = new ArrayList<>();
        float sum = 0;
        int count = 0;
        float average;
        for (int i : args) {
            sum += i;
            count++;
        }
        average = sum / count;
        System.out.print("Средне арефмитическое: " + average + "\n");
        for (int i : args) {
            if (i < average)
                mas.add(i);
        }
        return mas;
    }

    public static int max(int[] mas) {
        int mx = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mx < mas[i]) {
                mx = mas[i];
            }
        }
        return mx;
    }

}
