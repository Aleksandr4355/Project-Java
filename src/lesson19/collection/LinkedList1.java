package lesson19.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        Student st1 = new Student("Viktor", 2);
        Student st2 = new Student("Roman", 2);
        Student st3 = new Student("Irina", 2);
        Student st4 = new Student("Igor", 2);
        Student st5 = new Student("Anna", 2);
        LinkedList<Student> stLL = new LinkedList<>();
        stLL.add(st1);
        stLL.add(st2);
        stLL.add(st3);
        stLL.add(st4);
        stLL.add(st5);
        System.out.println("LinkedList = " + stLL);
        System.out.println(stLL.get(1));
        Student st6 = new Student("Masha", 2);
        Student st7 = new Student("Frodo", 1);
        stLL.add(st6);
        stLL.add(1, st7);
        System.out.println(stLL);
        Student st8 = new Student("Vlad", 1);
        stLL.set(1, st8);
        System.out.println(stLL);
        stLL.remove(3);
        stLL.removeFirst();
        stLL.removeLast();
        System.out.println(stLL);

//        for (Student el : stLL){
//            System.out.println(el);
//        }
//        Iterator p = stLL.listIterator(2);
//        while (p.hasNext()){
//            System.out.println(p.next());
//        }
        Iterator it = stLL.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator<Student> listIterator = stLL.listIterator();
        System.out.println("Итерация вперед");
        while (listIterator.hasNext()){
            System.out.println("Index = " + listIterator.nextIndex() +  ", Element = " + listIterator.next());
        }
        System.out.println("Итерация обратно");
        while (listIterator.hasPrevious()){
            System.out.println("Index = " + listIterator.previousIndex() +  ", Element = " + listIterator.previous());
        }
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.course = course;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}