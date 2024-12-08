package Lesson9.Treygolnik;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Rectangle {
    private  int length; // поля класса
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        if(length>0)
        this.length = length;
    }

    public void setWidth(int width) {
        if(width>0)
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimet(){
        return 2*(length+width);
    }

    public double getHypotenuse(){
        return Math.sqrt(Math.pow(length,2)+ Math.pow(width,2));
    }

    public void getPrint(){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
