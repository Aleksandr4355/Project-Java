package lesson19.set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetPrimer {
    public static void main(String[] args) {
        Set<Integer>num=new HashSet<>();
        num.add(43);
        num.add(31);
        num.add(24);
        num.add(54);
        num.add(21);
        System.out.println(num);

        Integer max = null;
        for(Integer item : num){
            if(max == null){
                max = item;
            }else if (max < item){
                max = item;
            }
        }
        System.out.println(max);
        System.out.println(Collections.min(num)); // нахождение минимальное значение
        System.out.println(Collections.max(num)); // нахождение максимальное значение
    }
}
