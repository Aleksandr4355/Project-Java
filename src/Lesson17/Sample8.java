package Lesson17;

import java.util.ArrayList;
import java.util.Arrays;

interface Bias{
    boolean test(Person p);
}
enum PetPreference{
    DOG, CAT, SNAKE;
}

public class Sample8 {
    public static void main(String[] args) {
        Person p1 = new Person("Роман", 35, true, PetPreference.DOG, new ArrayList<>(Arrays.asList("путешествия", "чтение")));
        Person p2 = new Person("Анна", 35, true, PetPreference.SNAKE, new ArrayList<>(Arrays.asList("туризим", "путешествия")));
        Person p3 = new Person("Александр", 24, false, PetPreference.CAT, new ArrayList<>(Arrays.asList("туризим", "изучение языков")));
        Person p4 = new Person("Михаил", 15, true, PetPreference.SNAKE, new ArrayList<>(Arrays.asList("чтение", "путешествия")));
        Person p5 = new Person("Ольга", 55, false, PetPreference.DOG, new ArrayList<>(Arrays.asList("Кушать", "путешествия")));

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
        System.out.println(people);

        System.out.println(filter(people, p -> p.isExtrovert()));
    }

    public static ArrayList<Person> filter(ArrayList<Person> people, Bias bias){
        ArrayList<Person> filteredPeople = new ArrayList<>();
        for(Person p : people){
            if(bias.test(p)){
                filteredPeople.add(p);
            }
        }
        return filteredPeople;
    }
}

class  Person{
    private String name;
    private  int age;
    private boolean extrovert;
    private PetPreference petPreference;
    private ArrayList <String> hobbies;

    public Person(String name, int age, boolean extrovert, PetPreference petPreference, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.extrovert = extrovert;
        this.petPreference = petPreference;
        this.hobbies = hobbies;
    }

    public boolean isExtrovert() {
        return extrovert;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", extrovert=" + extrovert +
                ", petPreference=" + petPreference +
                ", hobbies=" + hobbies +
                '}';
    }
}