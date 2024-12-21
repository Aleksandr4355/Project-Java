package Lesson11.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20,"green");
//        rectangle.setWidth(20);
//        rectangle.setHeight(5);
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Высота: " + rectangle.getHeight());
        System.out.println("Цвет: " + rectangle.getColor());
        System.out.println("Площадь: " + rectangle.area());
    }
}
