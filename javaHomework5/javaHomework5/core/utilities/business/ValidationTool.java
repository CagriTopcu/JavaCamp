package javaHomework5.core.utilities.business;

public class ValidationTool {
    public static boolean Run(boolean... logics){
        for(var logic : logics){
            if(logic == true){
                return true;
            }
        }
        return false;
    }
}
