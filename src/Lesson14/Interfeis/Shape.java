package Lesson14.Interfeis;

interface MathShape { // создание интерфейса
    double getSquare();

    default double getPerimeter(){
        return 0;
    }
}

abstract class  Geom implements MathShape{
    int width, color;
    abstract void draw();
}

class Line1 extends Geom implements MathShape,GeomInterface{
    @Override
    void draw() {
        System.out.println("Рисование линии");
    }

    @Override
    public double getSquare() {
        return 0;
    }
}

class InterfaceGroup {
   private interface Interface_1 {
        void method_1();

        private void  privateMethod(){
            System.out.println("privateMethod");
        }
    }
    interface Interface_2 extends Interface_1 {
        void method_2();
    }
    interface Interface_3 {
        void method_3();
    }
}
class  ReleaseInterface_1 extends InterfaceGroup{}
class  ReleaseInterface_2 implements InterfaceGroup.Interface_2{
    @Override
    public void method_1() {
    }
    @Override
    public void method_2() {
    }

}
class  ReleaseInterface_3 implements InterfaceGroup.Interface_3{
    @Override
    public void method_3() {

    }
}

interface GeomInterface { // создание интерфейса
    int MIN_COORD = 0; // перемменая объявляется автоматически с индекаторами public static final
    int MAX_COORD = 1000;

    static void showInterval() {
        System.out.println("[" + MIN_COORD + ";" + MAX_COORD + "]");
    }
}
/// /////////////////////////////
abstract class Shape {
    private int width;
    private String color;

    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }

    abstract void draw();

}

class Line extends Shape implements GeomInterface {
    private int x1, x2, y1, y2;

    public Line(int width, String color, int x1, int x2, int y1, int y2) {
        super(width, color);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setCoord(int x1, int y1, int x2, int y2) {
        if (isCheck(x1) && isCheck(y1) && isCheck(x2) && isCheck(y2))
            this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private boolean isCheck(int value) {
        return value >= MIN_COORD && value <= MAX_COORD;
    }

    @Override
    void draw() {
        System.out.println("Рисование линии");
    }

    @Override
    public String toString() {
        GeomInterface.showInterval();
        return "Координаты линии: " +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2;
    }
}

class Rectangle extends Shape implements MathShape {
    private int width;
    private int height;

    public Rectangle(int width, String color, int width1, int height) {
        super(width, color);
        this.width = width1;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование прямоугольника");
    }

    @Override
    public double getSquare() {
        return width * height;
    }
}

class Triangle extends Shape implements MathShape {
    private int length;
    private int height;

    public Triangle(int width, String color, int length, int height) {
        super(width, color);
        this.length = length;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование треугльника");
    }

    @Override
    public double getSquare() {
        return 0.5 * length * height;
    }


}