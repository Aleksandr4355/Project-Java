package Lesson17;

interface PrinTable{
    void print(String s);
}


public class Sample2 {
    public static void main(String[] args) {
        PrinTable prinTable = s -> System.out.println(s);
        prinTable.print("Hello, Java");
//        PrinTable prinTable = () -> System.out.println("Hello, Java");
    }
}
