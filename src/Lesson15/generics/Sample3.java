package Lesson15.generics;

import Lesson10.numbers.Numbers;

public class Sample3 {
    public static void main(String[] args) {
        Point2<Integer> pt = new Point2<>(1,3);
        Point2<Double> pt2 = new Point2<>(1.3,3.4);
        System.out.println(pt.getMax());
        System.out.println(pt2.getMax());

    }
}
class Point2 <T extends Number>{  // класс наследуется от Number это означает класс работает только с числовыми типами данных
    public T x,y;

    public Point2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    double getMax () {
        double xd =  x.doubleValue(); //преоброзование любых числовых типов данных в double
        double yd =  y.doubleValue();

        return (xd < yd) ? yd : xd;
    }
}
