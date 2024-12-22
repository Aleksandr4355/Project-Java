package Lesson11.animals;

public class Cat extends Animal{

    public void voice(String name) {
        System.out.println(name + " Mяу");
    }

    @Override
    public void voice() {
        System.out.println("Mяу!");
    }
}
