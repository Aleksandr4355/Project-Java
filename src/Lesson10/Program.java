package Lesson10;

//import static java.lang.System.*; // static может использовать импорт класса и тогда можно вызывать метод вот так: out.println(Point.getCount());

public class Program {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(3,4);
       System.out.println(Point.getCount()); // обращаемся к свойству класса Point

    }
}
class Point {
    private static int count; // статическое свойство(поле)
    int x; // динамическое свойство(поле)
    int y; // динамическое свойство(поле)

    static {
        count = 10;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.count++;
    }

    public static int getCount() {
        return Point.count;
    }
}