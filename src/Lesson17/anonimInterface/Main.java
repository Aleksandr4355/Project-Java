package Lesson17.anonimInterface;

interface CalcInterFace { // функциональный интерфейс
     int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        int x = 5, y = 3;
//        CalcInterFace sum = new CalcInterFace() { // метод ананимного класса
//            @Override
//            public void calculate(int a, int b) {
//                System.out.println(a + b);
//            }
//        };
        CalcInterFace sum = (a, b) -> a + b;// лямда выражения. анонимные классы можно преоброзовать в лямда выражения
        CalcInterFace sub = (a, b) -> a - b;// лямда выражения. анонимные классы можно преоброзовать в лямда выражения
        CalcInterFace mul = (a, b) -> a * b;// лямда выражения. анонимные классы можно преоброзовать в лямда выражения
        int res = sum.calculate(x,y);
        int res1 = sub.calculate(x,y);
        int res2 = mul.calculate(x,y);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }
}