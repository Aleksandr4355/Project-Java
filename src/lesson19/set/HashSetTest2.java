package lesson19.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 34, 5, 6, 57, 678, 878, 4, 4};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for(int num : set){
            uniqueArr[i++] = num;
        }
        System.out.println("Массив без дуюликатов: " + Arrays.toString(arr));
    }
}
