package Lesson11.Person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Бондарь" , "Даша" , 16);
        System.out.println(human);
        Student student = new Student("Захаренко", "Артем", 32, "Математика", "М_220", 90, 95);
        System.out.println(student);
        Teacher teacher = new Teacher("Леонов", "Григорий",41,1,"Программирование", 10);
        System.out.println(teacher);

    }
}
