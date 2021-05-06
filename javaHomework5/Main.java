import javaHomework5.business.abstracts.UserService;
import javaHomework5.business.concretes.UserManager;
import javaHomework5.core.adapters.GoogleAuthManagerAdapter;
import javaHomework5.dataAccess.concretes.HibernateUserDao;
import javaHomework5.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao(), new GoogleAuthManagerAdapter());

        User user1 = new User(5,"User 1", "User 1", "user5@user5","1234567890", true);
        userService.register(user1);

        User user2 = new User("user1@user1","1234567890");
        userService.login(user2);
    }
}
