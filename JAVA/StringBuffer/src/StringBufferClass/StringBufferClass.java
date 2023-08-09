package StringBufferClass;

public class StringBufferClass {
    private String str2 = "shubham";
    public void useOfStringBuffer(String str){
        String sb1 = new String("Welcome to java program");
        StringBuffer sb=new StringBuffer(str2);
        System.out.println("1. append(String str) - append specific string to character sequence = " + sb.append(str));
        System.out.println("1. insert(int offset, String str) - inserts the string into this character sequence : " +sb.append(56));
        System.out.println("delete(int start, int end) - Removes the characters in a substring of this sequence : " + sb.delete(1,4));
        System.out.println("replace(target, replacement) method - it replace given string from specified beginIndex and endIndex-1 : " + str2.replace("sh","bh"));
        System.out.println("reverse() method - the stringBuffer class reverse the current string class : " +sb.reverse());
        System.out.println("substring(int startIndex) method - it return new string by using starting index : " +sb1.substring(11));
        System.out.println("substring(int startIndex) method - it return new string by using startIndex and endIndex : " +sb1.substring(11,15));
        System.out.println("charAt() method - it return character value of specific index : " + str2.charAt(3));
        System.out.println("deleteCharAt() method - it remove character at specific position : " + str2.charAt(3));
        System.out.println("indexOf() method - Returns the index within this string of the first occurrence of the specified substring : " + str.indexOf("u"));
    }
}
