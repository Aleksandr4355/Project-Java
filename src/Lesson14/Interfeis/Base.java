package Lesson14.Interfeis;

public class Base {
    public static void main(String[] args) {
        Shape[] geom = new Shape[3];
        geom[0] = new Line(5, "red", 1, 2, 3, 4);
        geom[1] = new Rectangle(2, "yellow", 5, 10);
        geom[2] = new Triangle(2, "green", 4, 10);

        for (Shape g : geom) {
            g.draw();
            if (g instanceof MathShape) { // проверяем релизованы ли методы (интрефей) в классе  возращает true/false
                double s = ((MathShape) g).getSquare();
                System.out.println("Площадь: " + s);
            }
        }

        Line l = new Line(5,"red",1,2,3,4);
        System.out.println();
        System.out.println(l);
        System.out.println(GeomInterface.MIN_COORD);
        System.out.println(GeomInterface.MAX_COORD);
        GeomInterface.showInterval();
    }
}
