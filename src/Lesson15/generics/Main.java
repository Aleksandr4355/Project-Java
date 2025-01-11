package Lesson15.generics;

public class Main {
    public static void main(String[] args) {
        Integer [] intArray = {2,1,5,3,4}; // Integer класс обертка
        Double [] doubleArray = {3.2, 3.5, 5.4, 4.4};
        Character [] charArray = {'G','e','n','e','r','i','c'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
    public static <T> void printArray(T [] inputArray){ // обобщеный метод на разные типы данных Generic
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
    }
}
