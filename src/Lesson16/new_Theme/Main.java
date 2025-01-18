package Lesson16.new_Theme;

public class Main {
    public static void main(String[] args) {
        int x = 5, y = 3;
        Calc sum = new Calc();
        sum.calculate(x,y);

//        CalcElse nul = new CalcElse();
//        nul.calculate(x,y);

        Calc nul = new Calc(){ // анонимный класс
            @Override
            public void calculate(int a, int b) {
                System.out.println(a * b);
            }
        };
        nul.calculate(x,y);
    }
}
class Calc{
    public  void  calculate(int a, int b){
        System.out.println(a+b);
    }
}
//class CalcElse extends Calc{
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a*b);
//    }
//}

