package Lesson13.shaps;

public class Main {
    public static void main(String[] args) {
//        Square square = new Square(3, "Red");
//        square.info();
//        Rectangle rectangle = new Rectangle(7,3,"Green");
//        rectangle.info();
//        Triangle triangle = new Triangle(5,"yellow");
//        triangle.info();
        Shape []shapes = new Shape[3];
        shapes [0] = new Square(3, "Red");
        shapes [1] = new Rectangle(7,3,"Green");
        shapes [2] = new Triangle(5,"yellow");
        for (Shape shape : shapes){
            shape.info();
        }
    }
}
