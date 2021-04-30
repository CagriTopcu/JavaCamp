public class InstructorManager extends UserManager{
    public void addStudent(Student student){
        System.out.println(student.getFirstName() + " eklendi");
    }

    public void listStudents(Student[] students){
        for(Student student : students){
            System.out.println(student.getFirstName());
        }
    }

    @Override
    public void login(User user) {
        System.out.println(user.getFirstName() + " giriş başarılı!");
    }

    @Override
    public void register(User user) {
        System.out.println(user.getFirstName() + " kayıt başarılı!");
    }
}