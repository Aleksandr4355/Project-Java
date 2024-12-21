package Lesson11.Person;

public class Specialist extends Graduate{
    private int grade;

    public Specialist(String lastName, String firstName, int age, String speciality, String group, double rating, double attendance, String subject, int grade) {
        super(lastName, firstName, age, speciality, group, rating, attendance, subject);
        this.grade = grade;
    }

    public Specialist(Graduate graduate, int grade){
        super(graduate);
        setGrade(grade);
        System.out.println("GraduateCopyConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + "Specialist{" +
                "grade=" + grade +
                '}';
    }
}
