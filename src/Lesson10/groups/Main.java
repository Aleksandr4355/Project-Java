package Lesson10.groups;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Student students [] = new Student[n]; // массив экземпляров классов
        students[0]=new Student("Петров", "А.В", 1);
        students[1]=new Student("Иванов", "О.Б", 1);
        students[2]=new Student("Фролов", "Т.О", 1);
        students[3]=new Student("Прохаров", "А.М", 2);
        students[4]=new Student("Захаренко", "м.В", 2);
        students[5]=new Student("Середа", "У.М", 3);
        students[6]=new Student("Коростелев", "К.У", 3);
        students[7]=new Student("Вербов", "В.В", 3);
        students[8]=new Student("Шишкин", "П.В", 3);
        students[9]=new Student("Матрешкина", "Е.Е", 3);

        Random rd = new Random(); //  объявляем экземпляр класса генератора случайных чисел
        for (int i = 0; i < students.length; i++) {
//            do {} while (students[i].addGrade(rd.nextInt(12) + 1)); // тоже самое что и цикл for с переменной j
            for (int j = 0; j < students.length; j++) {
                students[i].addGrade(rd.nextInt(12) + 1);
            }
        }
        System.out.println("Все студенты: ");
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
        System.out.println("\nСтуденты с хорошей испиваемостью");
        for (int i = 0; i < students.length; i++) {
            if(students[i].isGood()){
                students[i].print();
            }
        }
    }
}
