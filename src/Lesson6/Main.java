package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Перегрузка метода
//        int a = 7, b = 3; // 1
//        double c = 5.1, d = 7.2;
//        int res1 = min(a, b);
//        double res2 = min(c, d);
//        System.out.println(res1);
//        System.out.println(res2);

//        int num = 4; //2
//        String str = "2 x 2 = ";
//        print(str);
//        print(num);
//        print(str , num);

//        int a = 7, b = 3, c = 5; //3
//        int res1 = sum(a, b);
//        int res2 = sum(a, b, c);
//        System.out.println("Сумма двух чисел: " + res1);
//        System.out.println("Сумма трех чисел: " + res2);


    }

    public static int min(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    } //1
    public static double min(double n1, double n2) {
        double min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    } //1

    public static void print(String text) { //2
        System.out.println(text);
    }       //2
    public static void print(int number) { //2
        System.out.println(number);
    }        //2
    public static void print(String text, int number) { //2
        System.out.println(text + number);
    } //2

    public  static int sum(int n1, int n2){
        return n1+n2;
    } //3
    public  static int sum(int n1, int n2, int n3){
        return n1+n2+n3;
    } //3

}
