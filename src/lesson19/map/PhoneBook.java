package lesson19.map;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Зовов", 778899, bookPhone);
        addNumber("Зовов", 112233, bookPhone);
        addNumber("Калинкин", 445577, bookPhone);
        addNumber("Романов", 889922, bookPhone);
        addNumber("Зовов", 445577, bookPhone);
        addNumber("Калинкин", 449988, bookPhone);
        printBok(bookPhone);

    }

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key,list);
        }
    }
    public static void printBok(HashMap<String, ArrayList<Integer>> map){
        for(var item : map.entrySet()){
            String phone = "";
            int i = 1;
            for (int element : item.getValue()){
//                phone = phone + element + ", ";
                phone = phone + element + ((item.getValue().size() == i) ? "" : ", ");
                i++;
            }
            System.out.printf("%s : %s%n",item.getKey(), phone);
        }
    }
}
