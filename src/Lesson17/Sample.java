package Lesson17;

interface WordCounter {
    int countWords(String text);
}

public class Sample {
    public static void main(String[] args) {
        String txt = "Лямда выражения";
        System.out.println("Исходная строка: " + txt);
        WordCounter wordCounter = (s) -> s.trim().split("\\s+").length;
        int ctr  = wordCounter.countWords(txt);
        System.out.println(ctr);

        txt = "Программа, которая подсчитывает количество слов в предложение";
        System.out.println("Исходная строка: " + txt);
        ctr  = wordCounter.countWords(txt);
        System.out.println(ctr);
    }
}
