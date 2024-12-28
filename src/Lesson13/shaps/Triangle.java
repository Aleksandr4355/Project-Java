package Lesson13.shaps;

public class Triangle extends Shape {

    private int side;

    public Triangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)*side*side)/4;
    }

    @Override
    public double getPerimeter() {
        return side + side + side;
    }

    @Override
    public void info() {
        System.out.println("===Треугольник===\nСторона: " + side + "\nЦвет: " + getColor() + "\nПлощадь: " + getArea() + "\nПириметр: " + getPerimeter());
        draw();
    }

    @Override
    public void draw() {
        for (int i = 0; i <= side; i++) {
            for (int j = i; j < side; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}

