package Lesson9;

public class program {
    public static void main(String[] args) {
//        Person p1 = new Person(); // создание нового экземпляра класса Person
//        p1.displayInfo();
//        p1.name = "Irina";
//        p1.age = 28;
//        System.out.println(p1.name);
//        Person p2 = new Person("Валентин");
//        p2.displayInfo();
        Person p3 = new Person("Марина", 225);
        p3.setName("Валентин");
//        p3.name = "Leo";
//        System.out.println(p3.getName());
//        p3.setAge(28);
//        p3.setAge(238);
        p3.displayInfo();
    }
}

class Person {
    private String name; // перемменая созданная в другом классе называется свойством
    private int age;

    { // иницилизации
        name = "неизвестно";
        age = 18;
    }

    public Person() { // конструктор класса Person
        //this("неизвестно", 25); // служебное слово
    }
    public Person(String n) { // конструктор класса Person
//        this(n,0);
        this.name = n;
    }
    public Person(String name, int age) { // конструктор класса Person
//        this.name = n;
//        this.age = a;
        setName(name);
        setAge(age);
    }
    public String getName (){ // get регистр
        return name;
    }
    public  void  setName(String name){
        this.name = name;
    }
    public int getAge (){
        return  age;
    }
    public void setAge(int age){
        if (age > 0 && age < 110)
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s%nAge: %d%n", name, age);
    }
}