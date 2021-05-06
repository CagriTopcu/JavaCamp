package javaHomework5.googleAuth;

import javaHomework5.entities.concretes.User;

public class GoogleAuthManager {
    public void auth(User user){
        System.out.println("Google ile kayıt olundu " + user.getEmail());
    }
}
