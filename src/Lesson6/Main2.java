package Lesson6;

import javax.swing.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
// Рекурсия
        Scanner input = new Scanner(System.in);
//        System.out.print("На каком вы этаже: ");
//        int n1 = input.nextInt(); // 5
//        elevator(n1);

//        int [] mas = {1,3,5,7,9};
//        System.out.println(sumList(mas));

//        int [] mas = {1,3,5,7,9};
//        System.out.println(sumList(0, mas));

        System.out.println(toSTR(254,16));

    }
//    public static void elevator(int n) { // 0
//        if (n == 0) {
//            System.out.println("Вы в подвале");
//            return;
//        }
//        System.out.println("=> " + n);
//        elevator(n-1); // область памяти стек: 5 4 3 2 1
//        System.out.print(n + " ");
//    }

//    public static int sumList (int [] arr){ // считает сумму элементов массива
//        int sum = 0;
//        for(int i: arr){
//            sum += i; //
//        }
//        return sum;
//    }

//    public static int sumList (int i, int [] arr){ // i = 0, mas = {1,3,5,7,9};
//        if (i == (arr.length-1)) // i == 4
//            return arr[i]; // 9
//        return arr [i] + sumList(i+1,arr); // 1+3+5+7+9
//    }

    public static String toSTR(int n, int base){
        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if(n<base)
            return convert[n]; // convert[2] => "2"
        else
            return toSTR(n/base,base) + convert[n%base]; // toSTR(254 / 10,10)+ convert[25 % 10] => "4" + "5"
    }

}