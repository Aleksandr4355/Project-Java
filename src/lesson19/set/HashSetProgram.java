package lesson19.set;

import java.sql.SQLOutput;
import java.util.*;

public class HashSetProgram {
    public static void main(String[] args) throws Dublicate_Number_Exception {
        try {
            List<Integer> list = readNumbers();
            checkDuplicates(list);
        } catch (Dublicate_Number_Exception e) {
            System.out.println("Ошибка " + e.getMessage());
        }
        System.out.println("Дубликатов нет");
    }

    static List<Integer> readNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Кол-во: ");
        int count = scan.nextInt();
        System.out.println("Введите целые числа: ");
        for (int i = 0; i < count; i++) {
            System.out.print("->");
            int num = scan.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    static void checkDuplicates(List<Integer> numbers) throws Dublicate_Number_Exception {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            if (uniqueNumbers.contains(num)) {
                throw new Dublicate_Number_Exception("Найден повторяющийся номер " + num);
            }
            uniqueNumbers.add(num);
        }
    }
}


class Dublicate_Number_Exception extends Exception {
    public Dublicate_Number_Exception(String message) {
        super(message);
    }
}