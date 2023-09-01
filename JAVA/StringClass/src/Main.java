public class Main {
    public static void main(String[] args) {
        /**
        * String()
        * Initializes a newly created String object so that it represents an empty character sequence.
        * */
        String str1 = new String();
        System.out.println(str1);

        /* *
        * String(String original)
        * Initializes a newly created String object so that it represents the same sequence of characters as the argument;
          in other words, the newly created string is a copy of the argument string.
        * */
        String str2 = new String("Shubham");
        System.out.println(str2);

        /* *
         * String(char[] value)
          Allocates a new String so that it represents the sequence of characters currently contained in the character array argument.
         */
        char[] ch = {'n','a','g','p','u','r'};
        String str3 = new String(ch);
        System.out.println(str3);

        /* *
         * String(char[] value, int offset, int count)
         *         Allocates a new String that contains characters from a subarray of the character array argument.
         *         Parameters:
         *         value - Array that is the source of characters
         *         offset - The initial offset
         *         count - The length
         *         Throws:
         *         IndexOutOfBoundsException - If the offset and count arguments index characters outside the bounds of the value array
         */
        String str4 = new String(ch,1,4);
        System.out.println(str4);

//======================================= String Methods in java ================================================================
        //1. charAt(int index) method - Returns the char value at the specified index.
        System.out.println("1. charAt(int index) method = " + str3.charAt(4));

        //2. codePointAt(int index) method - Returns the character (Unicode code point) at the specified index.
        System.out.println("2. codePointAt(int index) method = " + str3.codePointAt(4));

        //3. compareTo(String anotherString) - compare two string lexicographically.(by comparing two string and return ASCII code)
        String str5 = new String("shubham");
        System.out.println("3. compareTo(String anotherString) method = " + str2.compareTo(str5));

        //4. compareToIgnoreCase(String str) - Compares two strings lexicographically, ignoring case differences.
        System.out.println("4. compareToIgnoreCase(String str) method = " + str2.compareToIgnoreCase(str5));

        //5. concat(String str) method - Concatenates the specified string to the end of this string.
        System.out.println("5. concat(String str) method = " + str2 +" ".concat(str5));

        //6. hashcode() method - Returns a hash code for this string.
        System.out.println("6. hashcode() method = " + str5.hashCode());

        //7. indexOf(int ch) method - Return the index within this string of the first occurrence of the specified character.
        System.out.println("7. indexOf(int ch) method = " + str3.indexOf('u'));

        //8. indexOf(int ch, int fromIndex) method - Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
        System.out.println("8. indexOf(int ch, int fromIndex) method = " + str3.indexOf('a',3));

        //9. indexOf(String str) method - Returns the index within this string of the first occurrence of the specified substring.
        String str6 = new String("I love my very very country");
        String substring = new String("very");
        //print starting index of particular string
        System.out.println("9. indexOf(String str) method = " + str6.indexOf(substring));

        //10. indexOf(String str, int fromIndex) method - Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
        //return string index by starting from specific index value
        System.out.println("10. indexOf(String str, int fromIndex) method = " + str6.indexOf(substring,12));

        //11. lastIndexOf(int ch) method - Returns the index within this string of the last occurrence of the specified character.
        System.out.println("11. lastIndexOf(int ch) method = " + str6.lastIndexOf('a'));

        //12. length() method - Returns the length of this string.
        System.out.println("12. length() method = " + str6.length());

        //13. toLowerCase() - Converts all of the characters in this String to lower case using the rules of the default locale.
        System.out.println("13. toLowerCase() method = " +str2.toLowerCase());

        //14. toCharArray() - Converts this string to a new character array.
        System.out.println("14. toCharArray() method = " +str3.toCharArray());

        //15. contains()
        String str = "what do you know about me";
        System.out.println("15. contains() method = " +str.contains("do"));



    }
}