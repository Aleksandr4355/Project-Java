package Lesson17;

interface Calc{
    int calculate();
}

public class Samlpe3 {
        static int x = 10;
        static int y = 20;

    public static void main(String[] args) {
        Calc operation = ()-> {x = 30;
           return x+y;};
        System.out.println(x);
        System.out.println(operation.calculate());
    }

}
