public class PasswordProgram {
    public void checkPassword(String password, String str2){
        if(password.equals(str2)){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
    }
}
