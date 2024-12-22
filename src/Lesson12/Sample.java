package Lesson12;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Sample {
    public static void main(String[] args) {
//        Cat cat = new Cat("Том");
//        cat.makeSound();
//        cat.sleep();
//        Dog dog = new Dog("Бобик");
//        dog.makeSound();
//        dog.sleep();
        Animal animal[] = new Animal[2];
        animal[0] = new Dog("Герда");
        animal[1] = new Cat("Барсик");

        for (Animal ani : animal) {
            ani.makeSound();
            ani.sleep();
        }
    }
}

//Абстрактный класс
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name + " спит!");
    }

    //    Абстрактный метод
    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // абстрактный метод
    @Override
    public void makeSound() {
        System.out.println(getName() + " Гав");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    // абстрактный метод
    @Override
    public void makeSound() {
        System.out.println(getName() + " Мяу");
    }
}