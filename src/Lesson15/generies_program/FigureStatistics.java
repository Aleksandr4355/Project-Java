package Lesson15.generies_program;

public class FigureStatistics<T extends Figure> {
    T[] arr;

    public FigureStatistics(T[] arr) {
        this.arr = arr;
    }

    public double getSumArea() {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getArea();
        }
        return result;
    }

    public double getMaxArea(){
        double minArea = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(minArea < arr[i].getArea()){
                minArea = arr[i].getArea();
            }
        }return  minArea;
    }

    public double getMinArea(){
        double maxArea = Double.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(maxArea > arr[i].getArea()){
                maxArea = arr[i].getArea();
            }
        }return  maxArea;
    }
}
