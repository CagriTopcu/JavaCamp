public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        Instructor instructor1 = new Instructor(1, "Instructor 1", "Instructor 1", "instructor1", "123456", "1234");
        Instructor instructor2 = new Instructor(2, "Instructor 2", "Instructor 2", "instructor2", "1234567", "1235");

        Student student1 = new Student(1, "Student 1", "Student 1", "student1", "123456", "1234");
        Student student2 = new Student(2, "Student 2", "Student 2", "student2", "123456", "1235");

        User user1 = new User(1, "User 1", "User 1", "user1", "1234");
        User user2 = new User(2, "User 2", "User 2", "user2", "1235");

        userManager.listUsers(new User[]{ instructor1, instructor2, student1, student2, user1, user2 });
        studentManager.getStudentDetails(student1);
        instructorManager.listStudents(new Student[]{ student1, student2 });
        instructorManager.addStudent(student1);
    }
}
