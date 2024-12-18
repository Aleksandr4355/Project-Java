package Lesson11;

public class MyCalculation extends Calculation{ // расширение класса наследование методов родительского класса
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("Произведение: " + z);
    }

}
