package PACKAGE_NAME;
public class Client {
    Client() {}

    public static void main(String[] args) {
        StudentBuilder sb = new StudentBuilder();
        Student student = sb.setAge(1)
                .setEmail("testemail@gmail.com")
                .setFirstName("user_first_name")
                .setLastName("user_last_name")
                .setGender("Male")
                .setRollNumber(101)
                .build();

        System.out.println(student);
    }
}
