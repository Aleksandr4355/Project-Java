package Lesson15.generics;

public class Sample1 {
    public static void main(String[] args) {
        Point<Integer, String> pt  = new Point<Integer , String>();
        pt.setX(10);
        pt.setY(20);
        pt.setId("point_1");
        System.out.println(pt.getX() + " " + pt.getY());

        Point<Double, Integer> pt2 = new Point<>(10.3,54.3,1);

        System.out.println(pt2.getX() + " " + pt2.getY());
    }
}

class Point <Tt, V> {
    private V id;
    private Tt x, y;

    public Point(Tt x, Tt y, V id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public Point() {
    }

    public Tt getX() {
        return x;
    }

    public Tt getY() {
        return y;
    }

    public void setX(Tt x) {
        this.x = x;
    }

    public void setY(Tt y) {
        this.y = y;
    }

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }
}