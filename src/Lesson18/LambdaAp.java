package Lesson18;

@FunctionalInterface
interface Operation {
    int execute(int x, int y);

//    String concat(String a, String b);
}

public class LambdaAp {
    public static void main(String[] args) {
        Operation func = action(1);
        int a = func.execute(6, 5);
        System.out.println(a);

        int b = action(2).execute(8, 2);
        System.out.println(b);
    }

    private static Operation action(int number) {
        switch (number) {
            case 1:
                return (int x, int y) -> x + y;
            case 2:
                return (int x, int y) -> x - y;
            case 3:
                return (int x, int y) -> x * y;
            default:
                return (int x, int y) -> 0;
        }
    }
}
