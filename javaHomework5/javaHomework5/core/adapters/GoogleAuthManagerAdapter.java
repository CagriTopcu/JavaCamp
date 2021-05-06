package javaHomework5.core.adapters;

import javaHomework5.entities.concretes.User;
import javaHomework5.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{
    @Override
    public void authGoogle(User user) {
        GoogleAuthManager googleAuthManager = new GoogleAuthManager();
        googleAuthManager.auth(user);
    }
}
