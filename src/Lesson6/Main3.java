package Lesson6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Исключения
//        try { // попытаться
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        }catch (InputMismatchException e){
//            System.out.println("Вы ввели не целое число: " + e);
//        }catch (ArithmeticException e){
//            System.out.println("Делить на ноль нельзя: " + e);
//        }

//        try {
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        }catch (InputMismatchException | ArithmeticException  e){
//            System.out.println("Вы ввели не целое число: " + e);
//            System.out.println("Делить на ноль нельзя: " + e);
//        }finally { // вне зависимости выполнится
//            System.out.println("Конец программы");
//        }

//        try {
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//            System.out.println(a / b);
//        } finally { // вне зависимости выполнится
//            System.out.println("Конец программы");
//        }

//        try{
//        int [] numbers = new int [3];
//        numbers[3]=9;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Введен некорректный идеск:" + e);
//        }

        int res = getFactorial(5);
        System.out.println(res);
    }

    public static int getFactorial(int num) {
        int mul = 1;
        try {
            if (num < 1) {
                throw new Exception("Число меньше 1 указывать нельзя");
            }
            for (int i = 1; i <= num; i++) {
                mul *= i;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            mul = num;
        }
        return mul;
    }
}
