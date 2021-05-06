package javaHomework5.core.utilities.helpers;
import javaHomework5.core.utilities.messages.Messages;

public class EmailHelper {
    public static void sendVerificationMail(){
        System.out.println(Messages.sendedVerificationMail);
    }

    public static void verifiedUser(){
        System.out.println(Messages.verifiedUser);
    }
}
