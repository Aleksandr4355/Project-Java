package Lesson18;

interface HumanFactory<P extends Human> {
    P create(String firstName, String lastname);
}

public class Sample2 {
    public static void main(String[] args) {
        HumanFactory<Human> humanHumanFactory = Human::new;
        Human human = humanHumanFactory.create("Alex", "Pavlov");
        System.out.println(human);
    }
}

class Human {
    String firstName;
    String lastname;

    public Human(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}