package Lesson11.Person;

public class Graduate extends Student {
    private String subject;

    public Graduate(String lastName, String firstName, int age, String speciality, String group, double rating, double attendance, String subject) {
        super(lastName, firstName, age, speciality, group, rating, attendance);
        this.subject = subject;
        setSubject(subject);
    }

    public Graduate(Student student, String subject) {
        super(student);
        this.subject = subject;
        System.out.println("GraduateConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Graduate(Graduate other){
        super(other);
        setSubject(subject);
        System.out.println("GraduateCopyConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + " Graduate{" + "subject='" + subject + '\'' + '}';
    }
}


