package Lesson12.figure;

import Lesson11.shapes.Figure;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new FonFigure(10,20,"Red");
        rectangle.printFigure();
        Rectangle rectangle1 = new FrameFigure(20,32,2);
        rectangle1.printFigure();
    }
}
class Rectangle{
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printFigure (){
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
    }
}
class FonFigure extends Rectangle{
    private String fon;

    public FonFigure(int height, int width, String fon) {
        super(height, width);
        this.fon = fon;
    }

    @Override
    public void printFigure() {
        super.printFigure();
        System.out.println("Цвет: " + fon);
    }
}
class FrameFigure extends Rectangle{
    private int frame;

    public FrameFigure(int height, int width, int frame) {
        super(height, width);
        this.frame = frame;
    }

    @Override
    public void printFigure() {
        super.printFigure();
        System.out.println("Рамка:  " + frame);
    }
}