package javaHomework5.business.concretes;
import javaHomework5.business.abstracts.UserService;
import javaHomework5.business.constants.Messages;
import javaHomework5.core.adapters.AuthService;
import javaHomework5.core.utilities.business.BusinessRules;
import javaHomework5.core.utilities.business.ValidationTool;
import javaHomework5.core.utilities.helpers.EmailHelper;
import javaHomework5.core.utilities.validators.UserValidator;
import javaHomework5.dataAccess.abstracts.UserDao;
import javaHomework5.entities.concretes.User;

import java.util.ArrayList;

public class UserManager implements UserService {

    private UserDao userDao;
    private AuthService authService;
    private ArrayList<User> userList = new ArrayList<User>();


    public UserManager(UserDao userDao, AuthService authService){
        this.userDao = userDao;
        this.authService = authService;

        fakeInMemoryData();
    }

    @Override
    public void register(User user) {
        var businessRules = BusinessRules.Run(CheckUserMailExists(user));
        var validationRules = ValidationTool.Run(UserValidator.validate(user));

        if(validationRules && businessRules && user.isAuthType() == true){
            authService.authGoogle(user);
            EmailHelper.sendVerificationMail();
            EmailHelper.verifiedUser();
        }
        else if(validationRules && businessRules && user.isAuthType() == false){
            EmailHelper.sendVerificationMail();
            EmailHelper.verifiedUser();
            userDao.register(user);
        }
        else{
            System.out.println(Messages.unSuccessfulRegister);
        }
    }
    @Override
    public void login(User user) {
        for(User users : userList){
            if(user.getEmail() == users.getEmail() && user.getPassword() == users.getPassword()){
                var result = ValidationTool.Run(UserValidator.validate(user.getEmail(), user.getPassword()));
                if(result){
                    userDao.login(user);
                    break;
                }
            }
            else{
                System.out.println(Messages.unSuccessfulLogin);
                break;
            }
        }
    }

    private boolean CheckUserMailExists(User users){
        for(User user:userList){
            if(user.getEmail() != users.getEmail()){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    private void fakeInMemoryData() {
        User user1 = new User(1,"User 1","User 1","user1@user1","1234567890",true);
        User user2 = new User(2,"User 2","User 2","user2@user2","123456789",true);
        User user3 = new User(3,"User 3","User 3","user3@user3","1234567",false);
        User user4 = new User(4,"User 4","User 4","user4@user4","1234567890",false);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
    }
}
