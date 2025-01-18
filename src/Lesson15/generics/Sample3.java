package Lesson15.generics;

import Lesson10.numbers.Numbers;

public class Sample3 {
    public static void main(String[] args) {
        Point2<Integer> pt = new Point2<>(1,3);
        Point2<Double> pt2 = new Point2<>(1.3,3.4);
        System.out.println(pt.getMax());
        System.out.println(pt2.getMax());
        System.out.println(pt.equalsPoint(pt2)); // сравнение значений двых экземпляры класса

    }
}
class Point2 <T extends Number>{  // класс наследуется от Number это означает класс работает только с числовыми типами данных
    public T x,y;

    public Point2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    boolean equalsPoint (Point2<?> pt){ // метод для сравнения значений двух экземпляров класса. Знак ? позволяет работаь с любыми типами данных.
       return x.doubleValue() == pt.x.doubleValue() && y.doubleValue() == pt.y.doubleValue();
    }

    double getMax () {
        double xd =  x.doubleValue(); //преоброзование любых числовых типов данных в double
        double yd =  y.doubleValue();

        return (xd < yd) ? yd : xd;
    }
}
