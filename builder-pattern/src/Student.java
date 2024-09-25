package PACKAGE_NAME;
public class Student {
    private String firstName;
    private String lastName;
    private int rollNumber;
    private int age;
    private String gender;
    private String email;

    Student(StudentBuilder studentBuilder) {
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.gender = studentBuilder.gender;
        this.email = studentBuilder.email;
    }

    @Override
    public String toString() {
        return "Student details : "+ this.firstName + " "+this.lastName;
    }
}