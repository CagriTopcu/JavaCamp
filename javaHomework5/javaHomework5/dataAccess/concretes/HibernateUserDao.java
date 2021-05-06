package javaHomework5.dataAccess.concretes;
import javaHomework5.dataAccess.abstracts.UserDao;
import javaHomework5.entities.concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void register(User user) {
        System.out.println("Kayıt başarılı");
    }

    @Override
    public void login(User user) {
        System.out.println("Giriş başarılı");
    }
}
