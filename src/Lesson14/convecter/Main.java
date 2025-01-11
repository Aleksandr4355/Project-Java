package Lesson14.convecter;

public class Main {
    public static void main(String[] args) {
        double temperature = 21.5;
        final int N = 3;
        Converted converter[] = new Converted[N];
        converter[0] = new CelsiusConverted();
        converter[1] = new KelvinConverted();
        converter[2] = new FahrenheitConverted();

        for (Converted c : converter) {
            System.out.println("t = " + c.getConverted(temperature));
        }
    }
}

interface Converted {
    double getConverted(double baseValue);
}

class CelsiusConverted implements Converted {
    @Override
    public double getConverted(double baseValue) {
        return baseValue;
    }
}

class KelvinConverted implements Converted {
    @Override
    public double getConverted(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverted implements Converted {
    @Override
    public double getConverted(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}