public class Main {
    public static void main(String[] args) {
        String str1 = "java"; //store in string pool
        String str2 = "python";//store in string pool
        String str3 = "java";//store in string pool
        String str4 = "Data Science";//store in string pool

        String s1 = new String("Data Science");
        String s2 = new String("python");
        String s3 = new String("Data Science").intern();

        //(==) -> it check the address of values
        //.equals() method compare the values of object
        System.out.println((str1 == str3) + " => String are equals");//
        System.out.println((str2 == s2) + " => Strings are not equals");
        System.out.println(str2.equals(s2));
        System.out.println(str4==s3);

        String str = new String("Nagpur");

    }
}