package Lesson2;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = input.nextInt();
//        System.out.println("Вы ввели число: " + num);

//        System.out.print("Ввести свое имя: ");
//        String name = input.nextLine();
//        System.out.print("Введите свой возраст: ");
//        int age = input.nextInt();
//        System.out.print("Ввести свой возрас: ");
//        float height = input.nextFloat();
//        System.out.printf("Имя: %s. Возраст: %d. Рост: %.2f %n", name, age, height);

//        System.out.print("Возраст: ");
//        int age = input.nextInt();
//        input.nextLine();

//        System.out.print("Ввести свой рост: ");
//        float height = input.nextFloat();
//        input.nextFloat();
//
//        System.out.print("Имя: ");
//        String name = input.nextLine();
//
//        System.out.println(name + " " + height);
//        input.close();

//        System.out.println("Введите четыре числа ");
//        System.out.print("1: ");
//        int num1 = input.nextInt();
//        System.out.print("2: ");
//        int num2 = input.nextInt();
//        System.out.print("3: ");
//        int num3 = input.nextInt();
//        System.out.print("4: ");
//        int num4 = input.nextInt();
//        System.out.printf("Результат : %.2f %n", (float)(num1+num2)/(num3+num4));

//        int a = 5;
//        System.out.println(a+10); // 15 , a = 5
//       // a += 10; // a = a + 10          ***
//        a -= 2; // a = a - 2              ***
//        System.out.println(a);

//        Scanner input = new Scanner(System.in);
//        int a, b, c, sum;
//        System.out.println("Введите 1 число: ");
//        а = input.nextInt();
//        System.out.println("Введите 2 число: ");
//        b = input.nextInt();
//        System.out.println("Введите 3 число: ");
//        c = input.nextInt();
//        sum = a + b + c;
//        System.out.println("Сумма чисел: " + sum);

//        Scanner input = new Scanner(System.in);
//        int sum;
//        System.out.print("Введите 1 число: ");
//        sum = input.nextInt();
//        System.out.print("Введите 2 число: ");
//        sum += input.nextInt();
//        System.out.print("Введите 3 число: ");
//        sum += input.nextInt();
//        //sum = a + b + c;
//        System.out.println("Сумма чисел: " + sum);

//        int a = 5, b = 3;
//        System.out.println(a == b); // false
//        System.out.println(a != b); // true
//        System.out.println(a > b); // true
//        System.out.println(a >= b); // true
//        System.out.println(a < b); // false
//        System.out.println(a >= b); // true

//        Boolean a1 = 5 > 6 || 4 < 6; // false || true
//        Boolean a2 = 5 > 6 && 4 < 6; // false && true
//        Boolean a3 = 5 < 6 && 4 < 6; // true && true
//        Boolean a4 = 5 < 6 || 4 == 6; // true || true
//
//        System.out.println(a1); // true
//        System.out.println(a2); // false
//        System.out.println(a3); // true

//        boolean a1 = 25 > 6 || 4 / 2 < 3; // снача считает потом сравнивает
//        boolean a2 = 25 > 6 || 5 < 3 && 4 == 4; // false || false && true => true
//        boolean a3 = 25 > 6 && 5 < 3 || 4 == 4; // true && false || true => true
//        boolean a4 = 5 < 3; // true && false || true => true
//
//        System.out.println(a1); // true
//        System.out.println(a2); // true
//        System.out.println(a3); // true
//        System.out.println(!a4); // true

        /*
        if (условие); {
        команда 1
        }
        else {
        команда 2
        }
         */

//        int age;
//        System.out.print("Введите свой возраст: ");
//        Scanner input = new Scanner(System.in);
//        age = input.nextInt();
//        if (age >= 18) {
//            System.out.println("Доступ на сайт разрешен");
//            System.out.println("Добро пожаловать");
//        } else {
//            System.out.println("Доступ запрещен");
//            System.out.println("Вход разрешен с 18 лет");
//        }
//
//        int num1 = 17, num2= 7;
//        if (num1>num2)
//            System.out.println("Первое число больше второго");
//        else if (num1<num2)
//            System.out.println(" Певое число меньше второго");
//        else
//            System.out.println("Числа равны");

//        int age = 15;
//        if (age >= 18 && age <= 65) {
//            System.out.println("Вы можете работать");
//        } else {
//            System.out.println("Работать не обязательно");
//        }
//        int age = 64;
//        boolean isYoung = age >=18, isOld = age > 65;
//        if (isYoung && !isOld) {    //true && false
//            System.out.println("Вы можете работать");
//        } else {
//            System.out.println("Работать не обязательно");
//        }
//        int age = 15;
//        boolean isYout = age >= 18;
//        if (!isYout || age <= 65) {
//            System.out.println("Вы можете работать");
//        } else {
//            System.out.println("Работать не обязательно");
//        }

//        int age = 12;
//        if (age<18 || age>65)
//        {    System.out.println("Работать не обязательно...");
//        } else {
//            System.out.println("Можете работать...");
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите первую сторону :");
//        int side1 = input.nextInt();
//        System.out.print("Введите вторую сторону :");
//        int side2 = input.nextInt();
//        System.out.print("Введите третью сторону :");
//        int side3 = input.nextInt();
//        if (side1 == side2 && side1 == side3 && side2 == side3) {
//            System.out.println("Треугольник расновторонний...");
//        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
//            System.out.println("Треугольник равнобедренный...");
//        } else {
//            System.out.println("Треугольник разносторонний...");

//        Scanner input = new Scanner(System.in);
//        int day, time;
//        System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.print("Рабочий день. \nВведите время: ");
//            time = input.nextInt();
//            if (time >= 9 || time <=18){
//                System.out.println("Заведение открыто");
//            }else {
//                System.out.println("Закрыто. Откроется в 9:00");
//            }
//        } else if (day == 6 || day == 7) {
//            System.out.println("Выходной день. ");
//        } else {
//            System.out.println("Такогог дня недели не существует");
//        }

//
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.println(n%10);

//        int day;System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if(day >= 1 && day <= 5){
//            System.out.print("Рабочий день ");
//            if(day == 1) System.out.print("Понедельник");
//            if(day == 2) System.out.print("Вторник");
//            if(day == 3) System.out.print("Среда");
//            if(day == 4) System.out.print("Четверг");
//            if(day == 5) System.out.print("Пятница");
//        }else if(day == 6 || day == 7){
//            System.out.print("Выходной день");
//            if(day == 6) System.out.print("Суббота");
//            if(day == 7) System.out.print("Воскресение");
//        }else{    System.out.println("Такого дня недели не существует");
//        }

// Тернарный оператор

//        int number, res;
//        number = -10;
//        res = number>= 0 ? number : -number; // Тернарный оператор
//        System.out.println(res);

//        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//        System.out.println(age >= 18 ? "Приятного просмотра" : "Вам еще рано смотреть этот фильм" );

        Scanner input = new Scanner(System.in);
        


    }
}
