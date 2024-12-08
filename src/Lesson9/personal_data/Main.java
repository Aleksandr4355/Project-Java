package Lesson9.personal_data;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Юля","23.05.1986","43-45-67","Россия","Москва", "Космический проспект, 14д");
        h1.printInfo();
        h1.setName("Юлия");
        System.out.println(h1.getName());

    }
}
