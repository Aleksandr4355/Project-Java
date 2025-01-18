package Lesson16;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        try {
            a = getNumber("Введите первое число");
            b = getNumber("Введите первое число");
        }catch (NumberFormatException e){
            System.out.println("Занчение некорректно!");
        }


        System.out.println("результат: " + (a+b));
    }

    public static int getNumber(String message) throws  NumberFormatException{
        Scanner input = new Scanner(System.in);
        System.out.println(message + ": ");
        String s = input.nextLine();
        return Integer.parseInt(s);
    }
}
