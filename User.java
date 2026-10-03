public class User {

    private String firstName;
    private String lastName;
    private int IDNo;
    private String faculty;

    public User(String firstName, String lastName, int IDNo, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNo = IDNo;
        this.faculty = faculty;
    }

    public int getIDNo() {
        return IDNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFaculty() {
        return faculty;
    }
}