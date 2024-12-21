package Lesson11.Person;

public class Student extends Human{
    private String speciality;
    private String group;
    private double rating;
    private double attendance;

    public Student(String lastName, String fistName, int age, String specialityStudent, String group, double rating, double attendance) {
        super(lastName, fistName, age);
        setSpecialityStudent(specialityStudent);
        setGroup(group);
        setRating(rating);
        setAttendance(attendance);
        System.out.println("StudentConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Student(Human human, String specialityStudent, String group, double rating, double attendance) {
        super(human);
        setSpecialityStudent(specialityStudent);
        setGroup(group);
        setRating(rating);
        setAttendance(attendance);
        System.out.println("Student1Constructor:\t" + Integer.toHexString(hashCode()));
    }

    public Student(Student other){
        super(other);
        this.speciality = other.speciality;
        this.group = other.group;
        this.rating  = other.rating;
        this.attendance = other.attendance;
        System.out.println("StudentCopyConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpecialityStudent(String speciality) {
        this.speciality = speciality;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "speciality='" + speciality + '\'' +
                ", group='" + group + '\'' +
                ", rating=" + rating +
                ", attendance=" + attendance +
                '}';
    }
}
