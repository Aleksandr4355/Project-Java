package Lesson17;

interface Calc1 {
    int calculate(int a, int b);
}

public class Sample4 {
    public static void main(String[] args) {
        Calc1 operation = (int a, int b) -> {
            if (b==0){
                return 0;
            }else{
                return a/b;
            }
        };
        System.out.println(operation.calculate(20,10));
        System.out.println(operation.calculate(20,0));
    }

}

