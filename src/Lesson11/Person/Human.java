package Lesson11.Person;

public class Human {
    private String lastName;
    private String fistName;
    private int age;

    public Human(String lastName, String fistName, int age) {
        this.lastName = lastName;
        this.fistName = fistName;
        this.age = age;
        System.out.println("HumanConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Human (Human other){
        this.lastName = other.lastName;
        this.fistName = other.fistName;
        this.age = other.age;
        System.out.println("HumanCopyConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lastName='" + lastName + '\'' +
                ", fistName='" + fistName + '\'' +
                ", age=" + age +
                '}';
    }
}
