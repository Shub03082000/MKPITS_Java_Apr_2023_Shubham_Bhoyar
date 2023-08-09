package CheckWebsite;

public class CheckWebsite {
//    private String str1 = "http://";
    public void findWebsite(String str){
        String s1 = str.substring(0,11);
        if(s1.equals("http://www.")){
            if(str.substring(11).contains(".")){
                System.out.println("Valid website name");
            }else{
                System.out.println("Invalid website name");
            }
        }else{
            System.out.println("Invalid website name");
        }
    }
}
