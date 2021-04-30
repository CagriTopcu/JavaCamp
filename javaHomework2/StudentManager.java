public class StudentManager extends UserManager{
    public void getStudentDetails(Student student){
        System.out.println("Id: " + student.getId() + " First Name: " + student.getFirstName() + " Last Name: " + student.getLastName());
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
