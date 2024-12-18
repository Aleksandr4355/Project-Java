package Lesson11.Person;

public class Teacher extends Human{
    private int curatorGroup;
    private String specialityTeacher;
    private int amountObject;

    public Teacher(String lastName, String fistName, int age, int curatorGroup, String specialityTeacher, int amountObject) {
        super(lastName, fistName, age);
        this.curatorGroup = curatorGroup;
        this.specialityTeacher = specialityTeacher;
        this.amountObject = amountObject;
        System.out.println("TeacherConstructor:\t" + Integer.toHexString(hashCode()));
    }
    
    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "curatorGroup=" + curatorGroup +
                ", specialityTeacher='" + specialityTeacher + '\'' +
                ", amountObject=" + amountObject +
                '}';
    }
}

