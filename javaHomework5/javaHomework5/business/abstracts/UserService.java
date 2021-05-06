package javaHomework5.business.abstracts;
import javaHomework5.entities.concretes.User;

public interface UserService {
    void register(User user);
    void login(User user);
}
