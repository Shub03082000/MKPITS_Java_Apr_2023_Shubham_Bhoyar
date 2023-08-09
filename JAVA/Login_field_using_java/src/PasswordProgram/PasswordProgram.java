package PasswordProgram;

public class PasswordProgram {
    public void checkPassword(String str1, String str2){
        if(str1.equals(str2)){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
    }
}
