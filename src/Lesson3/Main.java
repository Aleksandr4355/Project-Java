package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int a = 10, b = 20;
//        System.out.println(a == b ? "a == b " : a > b ? "a > b" :"b > a");

//        int n = true ? (false ? 10:20):30;
//        System.out.println(n); // 20
//        float a = 10f, b = 23f;
//        System.out.println(b!=0?b/a:"Ошибка");

//        int n;
//        System.out.print("\t Выбор цвета сфетовора\n 1 - красный, 2 - желтый, 3 - зеленый");
//        n = input.nextInt();
//        switch (n) {
//            case 1:
//                System.out.println("Стоим");
//                break;
//            case 2:
//                System.out.println("ГOТОВИМСЯ");
//                break;
//            case 3:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета у светофора нет");
//                break;
//        }
//
//        int n;
//        System.out.print("\t Выбор цвета сфетовора\n 1 (11) - красный, 2 (22) - желтый, 3 (33)" +
//                "- зеленый");
//        n = input.nextInt();
//        switch (n) {
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("ГOТОВИМСЯ");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета у светофора нет");

//        int a, b;
//        System.out.print("Введите номер месяца");
//        a = input.nextInt();
//        switch (a) {
//            case 1, 3, 5, 7, 8, 10, 12:
//                System.out.println("в месяце 31 день");
//                break;
//            case 4, 6, 9, 11:
//                System.out.println("в месяце 30 день");
//                break;
//            case 2:
//                System.out.print("Введите год");
//                b = input.nextInt();
//                if (b % 4 == 0)
//                    System.out.println("29 дней");
//                else
//                    System.out.println("28 дней");
//                break;
//            default:
//                System.out.println("ошибка");
//        }
//        int a;
//        System.out.println("Введите номер месяца: ");
//        a = input.nextInt();
//        switch (){
//            case 12,1,2:
//                System.out.println("Зима");
//                break;
//            case 3,4,5:
//                System.out.println("Весна");
//                break;
//            case 6,7,8:
//                System.out.println("Лето");
//                break;
//            case 9,10,11:
//                System.out.println("Осень");
//                break;
//            default:
//                System.out.println("Ошибка");
//        }
//        int a;
//        System.out.print("Введите номер месяца: ");
//        a = input.nextInt();
//        switch (a){
//            case 12,1,2-> System.out.println("Зима");
//            case 3,4,5 ->System.out.println("Весна");
//            case 6,7,8 ->System.out.println("Лето");
//            case 9,10,11-> System.out.println("Осень");
//            default ->System.out.println("Ошибка");
//        }
//        input.close();

//        int a;
//        System.out.print("Введите номер месяца: ");
//        a = input.nextInt();
//        String s = "";
//        switch (a){
//            case 12,1,2-> s=("Зима");
//            case 3,4,5 ->s=("Весна");
//            case 6,7,8 ->s=("Лето");
//            case 9,10,11-> s=("Осень");
//            default ->s=("Ошибка");
//        }
//        System.out.println(s);

//        int a;
//        System.out.print("Введите номер месяца: ");
//        a = input.nextInt();
//        String s = switch (a) {
//            case 12, 1, 2 -> ("Зима");
//            case 3, 4, 5 -> ("Весна");
//            case 6, 7, 8 -> ("Лето");
//            case 9, 10, 11 -> ("Осень");
//            default -> ("Ошибка");
//        };
//        System.out.println(s);


//        System.out.print("Введите балл по 12 бальной системы оценивания: ");
//        int num = input.nextInt();
//        System.out.print("Ваши бал по 5 бальной системе оценивания: ");
//        switch ((num >= 1 && num <= 3) ? 2 : (num >= 4 && num <= 6) ? 3 : (num >= 7 && num <= 9) ? 4 : (num >= 10 && num <= 12) ? 5 : 0) {
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Ошибка");
//        }

        // Циклы for, while, do while
        //while (условие){
        // команда
        // }

//        int i = 0; // переменная счетчик
//        while (i < 5) { // условие
//            System.out.println(i);
//            i++; // шаг цикла
//        }

//        int i = 5;
////        while (i > 0) {
////            System.out.println(i);
////            i--;
////        }

//        int i = 100; // переменная счетчик
//        while (i > 0) { // условие
//            System.out.println(i);
////            i = i / 5; // шаг цикла
//            i = i - 2; // четное число
//        }

//        int n, sum = 0;
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n; // sum = sum + n;
//        }
//        System.out.println("Сумма введеных чисел: " + sum);

//        int start, finish, sum = 0;
//        System.out.print("Введите начальное число допозона: ");
//        start = input.nextInt();
//        System.out.print("Введите конечное число допозона: ");
//        finish = input.nextInt();
//        while (start <= finish) {
//            if (start % 2 != 0)
//                sum += start;
//            start++;
//        }
//        System.out.println("Сумма нечетных чисел: " + sum);

//        int i = 0;
//        do {добрый
//            System.out.println("i= " + i);
//            i++;
//        } while (i < 5);

//        int num, sum = 0, count = 0;
//        float average;
//        do {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if (num < 0) {
//                sum += num;
//                count++;
//            }
//        } while (num != 0);
//        average = (float) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f" , average);

//        int number, copy, reverse_number = 0;
//        System.out.print("Введите число: ");
//        number = input.nextInt(); // 321
//        copy = number; // 321
//        do {
//            reverse_number *= 10; // reverse_number = reverse_number * 10; reverse_number = 0 * 10 => 0
//            reverse_number += copy % 10; // reverse_number = reverse_number + copy % 10; reverse_number = 0 + 1 => 1
//            copy /= 10; //32
//        } while (copy > 0);
//        System.out.println("Число " + number + (number == reverse_number ? " " : " не ") + "палиндром");

//        int i = 0;
//        while (i< 10 ){
//            if (i == 3){
//                i++; // 4
//                continue; // прерывает текущию операцию цикла и возращает в начала для провреки условия
//            }
//            System.out.println(i);
//            if (i==5){
//                break; // прерывает цикл
//            }
//            i++;
//        }
//        System.out.println("Цикл завершен ");

//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//    }

//        int n;
//        while (true) {
//            System.out.println("Введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0){
//                break;
//            }
//        }

//        int n = 0, proizv = 0;
//        while (true) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            if (n == 0) break;
//            if (proizv == 0)
//                proizv++;
//            proizv *= n;
//        }
//        System.out.println("Произведение чисел : " + proizv);
//        input.close();

//        //Таблица умножения
//        int i = 1;
//        while (i < 10) {
//            int j = 1;
//            while (j < 10) {
//                System.out.print(i + " * " + j + " =" + i * j + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        int i=0;
//        while (i<3){
//            int j=0;
//            while (j<6){
//                System.out.print("^");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                System.out.print(i % 2 == 0 ? "+" : "-");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i=0;
//        while (i<5){
//            int j=0;
//            while (j<5){
//                System.out.print(i==j ? "*" : " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Цикл for
        // for (иницилизация_перемменой; условие; шаг_цикла) {
        // }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        for (; i < 5; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        for (; i < 5; ) {
//            System.out.println(i);
//            i++;
//        }
//        int i = 0;
//        for (; ; ) {
//            System.out.println(i);
//            if (i==4){
//                break;
//            }
//            i++;
//        }

//        int count = 0; // иницилизировать
//        for(int i = 0; i< 6; i++){
//            System.out.print("-> ");
//            if (input.hasNextInt()){
//                count++;
//            }
//            input.nextLine();
//        }
//        System.out.println("Вы ввели чисел: " + count);

//        int n;
//        System.out.print("Колличество символов: ");
//        n = input.nextInt();
//        for (int i = 0; i < n ; i++){
//        System.out.println("*");
//        }
//        System.out.print("Тип символа : ");
//        char symb=input.next().charAt(0);

//        int n;
//        System.out.print("Введите целое число: ");
//        n = input.nextInt();
//        for (int i = 1; i<=n;i++){
//            if (n% i == 0)
//            System.out.println(i + " ");
//        }

//        for (int i = 10; i<100; i++){ // i = i + 1
//            if(i / 10 == i % 10)
//            System.out.print(i + " ");
//        }

//        for (int i = 10; i>0; i--){
//            System.out.print(i + " ");
//        }
//
//        for (int i = 10; i <= 100; i += 10) { // i = i + 10
//            System.out.print(i + " ");
//        }

//      int a=0;
//        for (int i = 5, a = 0; i > 0; i--, a++) {
//            System.out.print("Шаг: " + a + " Значение: ");
//            System.out.println(i);
//        }

//        for (int i = 0; i < 3; i++)  {
//            System.out.println("+++");
//            for (int j = 0; j < 2; j++) {
//                System.out.println("-----");
//            }
//        }

//        int w, h;
//        System.out.print("введите ширину прямоугольник: ");
//        w = input.nextInt();
//        System.out.print("введите высоту прямоугольник: ");
//        h = input.nextInt();
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 8; i++) { //i =0
//            for (int j = 0; j < i; j++) { // j==0
//            System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i >= j)
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}