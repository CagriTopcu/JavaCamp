public class UserManager {
    public void login(User user){
        System.out.println(user.getFirstName() + " giriş başarılı!");
    }

    public void logout(){
        System.out.println("Çıkış yapıldı!");
    }

    public void register(User user){
        System.out.println(user.getFirstName() + " kayıt başarılı!");
    }

    public void listUsers(User[] users){
        for(User user : users){
            System.out.println(user.getFirstName());
        }
    }
}