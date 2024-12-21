package Lesson11.Person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Бондарь" , "Даша" , 16);
        System.out.println(human);

        Teacher teacher = new Teacher("Леонов", "Григорий",41,1,"Программирование", 10);
        System.out.println(teacher);

        Student student1 = new Student(human, "Физика", "A-23", 0,0);
        System.out.println(student1);

        Student student = new Student("Захаренко", "Артем", 32, "Математика", "М_220", 90, 95);
        System.out.println(student);

        Graduate graduate1 = new Graduate(student,"Математические вычисления");
        System.out.println(graduate1);

        Graduate graduate = new Graduate("Шугани", "Сергей", 25, "Сети", "DS_11", 80,20, "Защита персональных данных");
        System.out.println(graduate);

        Specialist specialist = new Specialist(graduate, 5);
        System.out.println(specialist);

    }
}
