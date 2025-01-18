package Lesson16.dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.putCollar();
        dog.putLeash();
//        dog.putMuzzle();
        try {
            dog.walk();
        }catch (DogIsNotReadyException e){
            System.out.println(e.getMessage());
            System.out.println("\nПроверяем снаряжение!\nОшейник " + dog.isCollarPutOn+ "\nПоводок " + dog.isLeashPutOn + "\nНамордник " + dog.isMuzzlePutOn);
        }

    }
}
