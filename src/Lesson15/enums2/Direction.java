package Lesson15.enums2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public enum Direction {
    TOP, RIGHT, BOTTOM, LEFT;

    private static final Random RAND = new Random();

    public  static  Direction randomDirection(){
        Direction [] directions = values();
//        System.out.println(Arrays.toString(directions));
        return directions [RAND.nextInt(directions.length)];
    }

}
