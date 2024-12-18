package Lesson11;


public class Test {
    public static void main(String[] args) {
        Line l1 = new Line();
        l1.color = "red";
        l1.width = 5;
        l1.x1 = l1.y1 = 0;
        l1.x2 = l1.y2 = 10;
        l1.show();
        l1.showId();
    }
}
class Properties {
    int width;
    String color;
    int id = 1;

    public Properties() {
        System.out.println("Конструктлор Properties");
    }

    public Properties(int width, String color) {
        this.width = width;
        this.color = color;
        System.out.println("Конструктлор Properties (width, color)");
    }


    void show(){
        System.out.println("Ширина - " + width + " px, Цвет - " + color);
    }
}
class  Line extends Properties {
    double x1, y1;
    double x2, y2;
    int id = 2;

    public Line() {
        super(10,"Blu"); // ключевое слова super позволяет вызывать конструктор из родительского класса
        System.out.println("Конструктлор Line");
    }

    @Override // отметка о переопределение метода  всегда надо указывать
    void show(){
        super.show(); // // ключевое слова super позволяет вызывать метод show из родительского класса
        System.out.println("Кординаты линии - х1: " + x1 + ", x2: " + x2 + ", y1: " + y1 + ", y2: " + y2);
    }

    void showId(){
        System.out.println("id = " + id + ", super.id = " + super.id); // super.id  , вызываем свойсво ародительского класса
    }
}
class Triangle extends Properties{
    double x1, y1;
    double x2, y2;
    double x3, y3;
}
