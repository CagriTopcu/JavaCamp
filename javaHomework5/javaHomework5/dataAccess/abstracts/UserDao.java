package javaHomework5.dataAccess.abstracts;
import javaHomework5.entities.concretes.User;

public interface UserDao {
    void register(User user);
    void login(User user);
}
