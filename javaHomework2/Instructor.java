public class Instructor extends User{
    private String instructorNumber;

    public Instructor() {

    }

    public Instructor(int id, String firstName, String lastName, String username, String password, String instructorNumber) {
        super(id, firstName, lastName, username, password);
        this.instructorNumber = instructorNumber;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
}
