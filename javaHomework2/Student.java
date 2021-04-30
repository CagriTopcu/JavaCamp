public class Student extends User{
    private String studentNumber;

    public Student() {

    }

    public Student(int id, String firstName, String lastName, String username, String password, String studentNumber) {
        super(id, firstName, lastName, username, password);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
