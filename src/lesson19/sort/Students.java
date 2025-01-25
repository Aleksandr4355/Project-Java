package lesson19.sort;

public class Students {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", 30);
        Person p2 = new Person("Sveta", 18);
        int res = p1.compareTo(p2);
//        System.out.println(res);
        switch (res){
            case -1 -> System.out.println(p2.getName() + " старше");
            case 1 -> System.out.println(p1. getName() + " старше");
            default ->  System.out.println(p1. getName() + "Эти люди одного возраста ");
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age == o.age) {
            return 0;
        } else
            return this.age > o.age ? 1 : -1;
    }
}