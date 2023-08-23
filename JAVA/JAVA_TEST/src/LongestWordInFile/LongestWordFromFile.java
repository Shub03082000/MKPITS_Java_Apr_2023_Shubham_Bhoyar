package LongestWordInFile;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LongestWordFromFile {
// ========================================== first way to display longest word in file =============================//
//    public static void longestWord() throws FileNotFoundException, IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("xyz.txt"));
//        String string = bufferedReader.readLine();
//        String longestWord = "";
//        while (string != null) {
//            String[] array = string.split(" ");
//            for(int number=0; number< array.length; number++){
//                if(array[number].length() > longestWord.length()){
//                    longestWord = array[number];
//                }
//            }
//            string = bufferedReader.readLine();
//        }
//        System.out.println("Longest word in text file = " + longestWord);
//    }


//======================================== Second way to display longest word using Scanner class ================================//
    public static void longestWordUsingScanner() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("xyz.txt"));
        String currentWord;
        String longestWord = "";
        while (scanner.hasNext()){  //check whether next word exist or not
            currentWord = scanner.next();
            if(currentWord.length() > longestWord.length()){
                longestWord = currentWord;
            }
        }
        System.out.println("Longest word in file = " + longestWord);
    }
}
