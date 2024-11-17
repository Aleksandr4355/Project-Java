package Lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int mas [] = new int[4];
//
//        int[] mas2 = new int[5];
//
//        int mas3[];
//        mas3 = new int[4];

//        int mas[]=new int[]{2,7,5,3};

//        int mas[] = {2, 7, 5, 3};

//        int mas [] = new int[4];
//        mas[0]=5;
//        mas[1]=2;
//        mas[2]=7;
//        mas[3]=mas[1]+mas[2];

//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
//        System.out.println(mas.length); // узнать Длину массива
//
//        int last = mas[mas.length - 1]; // Используем последние значение массива
//        System.out.println(last);

//        int mas [] = new int[4];
//        mas[0]=5;
//        mas[1]=2;
//        mas[2]=7;
//        mas[3]=mas[1]+mas[2];
//        for (int i = 0; i < mas.length; i++) {
//            System.out.println(mas[i]);
//        }

//        int n = 100;
//        int[] mas = new int[n*2+3];
//        System.out.println(mas.length);

//        int n = 10;
//        int[] mas = new int[n];
//        System.out.println(mas.length);
//        mas[n - 1] = 2; //mas[9]=2
//        mas[n - 2] = 3; //mas[8]=3
//        mas[n / 5] = mas[n - 1] + mas[n - 2]; // mas [2] = mas [9] + mas [8] == 5
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }

//        int[] array = new int[4];

//        System.out.println("Ввести число: ");
//        array [0] = input.nextInt();
//        System.out.println("Ввести число: ");
//        array [1] = input.nextInt();
//        System.out.println("Ввести число: ");
//        array [2] = input.nextInt();
//        System.out.println("Ввести число: ");
//        array [3] = input.nextInt();

//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Ввести число: ");
//            array [i] = input.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array [i] + " ");
//        }

//        int n;
//        System.out.print("Ведите число массива:");
//        n = input.nextInt();
//        int[] array;
//        if (n < 5) {
//            array = new int[n];
//            for (int i = 0; i < array.length; i++) {
//                System.out.print("-> ");
//                array[i] = input.nextInt();
//            }
//        } else {
//            array = new int[n];
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("");

//       int [] array = new int [10];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("->");
//            array [i] = input.nextInt();
//        }
//        for (int i = array.length-1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }
//        int [] array = {1,4,6,3,8};
//        System.out.println(Arrays.toString(array));

//        int n, sum = 0;
//        System.out.print("Введите количество элементов: ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                sum += array[i]; //sum = sum + array[i]
//            }
//        }
//        System.out.println("Сумма отрицателньых элементов массива " + sum);

//        int min;
//        int array[] = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) ;
//            min = array[i];
//        }
//        System.out.println("Минимальное значения цикла: " + min);

//        System.out.print("Вводим размер массива: ");
//        int size = input.nextInt();
//        int[] array = new int[size];
//        int min;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("->");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > array[i - 1])
//                System.out.print(array[i] + " ");
//        }
//        input.close();

//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length + 5];
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//        for (int i = 0; i < a2.length; i++) {
//            System.out.print(a2[i] + " ");
//        }

//        double a = Math.random(); // [0;1)
//        System.out.println(a);

        // (Math.random() * (max-min)) + min => Math.random() * (3-0) + 0 => Math.random() * 3
//
//        double a = Math.random() * 3; // [0;3) Math.random() * (3-0) + 0 => Math.random() * 3
//        System.out.println(a);

//        double a = 2 + Math.random() * 5; // [2;7) Math.random() * (7-2) + 2 => Math.random() * 5 + 2
//        System.out.println(a);
//
//        double b =Math.random() * 5 + 2; // [2;7)  Math.random() * (7-2) + 2 => Math.random() * 5 + 2
//        System.out.println(b);

//        double b =Math.random() * 10 - 5; // [-5;5)  Math.random() * (5-(-5)) + (-5) => Math.random() * 10 - 5 (минус 5 будет формироваться, а 5 не буде появляться тоько до 5)
//        System.out.println(b);

//        int b = (int) (Math.random() * 3); //  [0;3) преоброзование типа чтоб получить целые числа
//        System.out.println(b);

//        int b = 3 + (int) (Math.random() * 2); // [3;5)
//        System.out.println(b);

//        int b = (int) (Math.random() * (10+1)) - 5; // [-5;5] 5 включается
//        System.out.println(b);

//        int b = (int) (Math.random() * 7 - 2); // [-2;5)
//        System.out.println(b);

//        int[] array = new int [10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10); // [0;10)
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int [10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 12 + 2); // [2;14)
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int [20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 31 - 15); // [-15;16)
//        }
//        System.out.println(Arrays.toString(array));

//        int n = 0, sum = 0;
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10); // [10;50)
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                n++;
//            } else
//                sum += array[i]; // расчет сумма нечеиных чисел
//        }
//        System.out.println("Количество четных чисел: " + n);
//        System.out.println("Количество сумма нечетных чисел: " + sum);

        // for (обЪявления_переменно : выражение){
        //  команды
        // }
//        int [] numbers = {10,20,30,40,50};
//        for (int i = 1; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//        for (int x : numbers ){  // int x = 10;
//            System.out.print(x + " ");
//        }

//        String [] names = {"Олег","Иван","Дима","Юля"};
//        for (String name : names){
//            System.out.print(name + "\t");
//        }

//        int[] array = new int[30];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10); // [10;50)
//        }
//        System.out.println(Arrays.toString(array));
//        for(int num : array ){
//            System.out.print(num + " ");
//        }\
//        System.out.print("Ввведите начало: ");
//        int k = input.nextInt();
//        System.out.print("Ввведите конец: ");
//        int n = input.nextInt();
//        if (k>n){
//        int temp = k;
//        k = n;
//        n = temp;}
//        int [] array = new int[n-k+1];
//        for (int i = 0, j = k; i <= n - k; i++, j++) {
//            array[i] = j;
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println("\n" + Arrays.toString(array));

//        int h = 7;
//        int w = h * 2 - 1;
//        int m = w / 2;
//        for (int i = 0, l = m, r = m; i < h; i++, l--, r++) {
//            for (int j = 0; j < w; j++) {
//                if (j >= l && j <= r) {
//                    System.out.print("*");
//                } else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
// строковые массивы
//        String [] cities = {"Брянск", "Иркутск","Владивосток"," Армавир"};
//        String[] cities2 = new String[cities.length + 1];
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i]=cities[i];
//        }
//        cities2[cities.length] = "Красноярск";
//        System.out.println(Arrays.toString(cities));
//        System.out.println(Arrays.toString(cities2));

// ArrayList
//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Брянск"); // добавть горов в созданый список(массив)
//        cities.add("Иркутск");
//        cities.add("Владивостко");
//        cities.add("Армовир");
//        cities.add(1, "Красноярск");
//        System.out.println(cities);
//        System.out.println(cities.get(2)); // обращение к определенорй ячейки
//        cities.set(2, "Курск"); // присвоить значение ячеки памяти по индексу
//        System.out.println(cities.size()); // колличество ячеек памяти задействованых в списке
//        cities.remove(1); // удаление по индексу
//        cities.remove("Владивостко"); // удаление по значени строкового
////        for (String city : cities) {
////            System.out.print(city + "\t");
////        }
////        System.out.print("\n" + cities.indexOf("Владивостко")); // по значению, найти индекс ячеки памати где хранится значение
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.print(cities.get(i) + "\t");
//        }
//        if (cities.contains("Курск")){   // метод позволяет проверить весь список на наличе значения Курск
//        System.out.println("Курск есть в списке");
//        }

//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элемента списка: ");
//        while ((n = input.nextInt()) > 0) {
//            mas.add(n);
//        }
//        System.out.println(mas); // вывод всего масива
//        System.out.println("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k); // удаление ячеки по индексу
//        System.out.print(mas);

//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100)); // заполнить случайными числами
//        }
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//        for (int i = 0; i < 10; i++) {
//            if (mas.get(i) > max){ // нахождение элемента с максимальным значением
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMAX: " + max);
//        ind = mas.indexOf(max); // находим идекс максимального элемента
//        mas.remove(ind); // удаляем значение по индексу. можно обЪединить строки mas.remove(mas.indexOf(max));
//        mas.add (0, max);
//        System.out.println(mas);

//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
//        ArrayList<Integer> c = new ArrayList<>(Arrays.asList());
//        System.out.println(b);
//        for (int i = 0; i < b.size(); i++) { // 1 вариант решения
//            if (i < a.size()) {
//                c.add(a.get(i));
//                c.add(b.get(i));
//            } else if
//            (i < b.size());
//        }
//        for (int i = 0; i < a.size(); i++) { // 2 вариант решения
//            c.add(a.get(i));
//            c.add(b.get(i));
//        }
//        for (int i = a.size(); i < b.size(); i++) { // 2 вариант решения
//            c.add(b.get(i));
//        }

//Двумерный  массив
//        int[][] num = {{0, 1, 2, 3},
//                {4, 5, 6, 7},
//                {8, 9, 10, 11}};
//        System.out.println(num[1][3]); // 7
//        for (int i = 0; i < num.length; i++) { //длин массива равна 3
//            System.out.println(Arrays.toString(num[i]));
//        }

//        int[][] num = {{0, 1, 2, 3},
//                {4, 5, 6, 7},
//                {8, 9, 10, 11}};
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        char [][] graph = new char[n][n];
//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph[i].length; j++) {
//                graph [i][j] = '*';
//            }
//        }
//        for (int i = 0; i < graph.length; i++) {
//            System.out.println(Arrays.toString(graph[i]));
//        }

//        int n = 4, m = 3, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 31 - 20);
//                System.out.print(mas[i][j] + "\t\t");
//                if (mas[i][j] <0){
//                    count++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("количесвто отрицательных чисел: " + count);

//        int a = 3;
//        int b = 3;
//        int first = 0;
//        int second = 0;
//        int third = 0;
//        int[][] array = new int[a][b];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                int random = ((int) (Math.random() * 101));
//                array[i][j] = random;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == 0) {
//                    first += array[i][j];
//                } else if (i == 1) {
//                    second += array[i][j];
//                } else {
//                    third += array[i][j];
//                }
//            }
//        }
//        System.out.println("Сумма элементов первой строки: " + first);
//        System.out.println("Сумма элементов второй строки: " + second);
//        System.out.println("Сумма элементов третьей строки: " + third);

//        int[][] mas = new int[3][5];
//        int pos = 0;
//        int sum = 0;
//        int minsum = Integer.MAX_VALUE; //
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 100);
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        } for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                sum += mas[i][j];
//            }
//            if (minsum > sum) {
//                minsum = sum;
//                pos = i;
//            }
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + sum);
//            sum = 0;
//        }
//        System.out.println("Строка с минимальной суммой элементов " + minsum + " имеет номер :" + (pos + 1));


// Зубчатый массив
//        int [][] mas = new int [3][];
//        mas[0] = new int [1];
//        mas[1] = new int [2];
//        mas[2] = new int [3];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print("->");
//                mas [i][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] mas = new int[][]{{1, 2},{3, 4, 5},{6, 7, 8, 9}} ;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] mas = new int[5][];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = new int[i + 1];
//        }
//        int count = 0;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count++;
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] mas = new int[5][];
//        for (int i = 0; i < 5; i++) {
//            mas[i] = new int[i + 1];
//            for (int j = 0; j <= i; j++) {
//                mas[i][j] = (int) (Math.random() * 15);
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }

//        int[][] mas = new int[5][];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = new int[mas.length - i];
//        }
//        int count = 10;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count++;
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int n = 6;
//        int[][] tp = new int[n][];
//        for (int i = 0; i < tp.length; i++) {
//           tp [i] = new int [i+1];
//           tp [i][0] = 1;
//           tp [i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                tp [i][j] = tp [i-1] [j-1] + tp [i-1][j];
//            }
//        }
//        for (int i = 0; i < tp.length; i++) {
//            for (int j = 0; j < tp.length - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                if (tp [i][j]>9){
//                    System.out.print(tp[i][j] + "  ");
//                } else
//                System.out.print(tp[i][j] + "  ");
//            }
//            System.out.println();
//        }
    }
}
