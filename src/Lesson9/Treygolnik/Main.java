package Lesson9.Treygolnik;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,15);
        rect1.setLength(3);
        rect1.setWidth(9);
        System.out.println("Длина прямоугольника: " + rect1.getLength());
        System.out.println("Ширина прямоугольника: " + rect1.getWidth());
        System.out.println("Площадь прямоугольника: " + rect1.getArea());
        System.out.println("Пириметр прямоугольника: " + rect1.getPerimet());
        System.out.printf("Гипотенуза прямоугольника: %.2f%n", rect1.getHypotenuse());
        rect1.getDraw();
    }
}
