package LongestWordInFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LongestWordFromFile {
    public static void longestWord() throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("xyz.txt"));
        String string = bufferedReader.readLine();
        String longestWord = "";
        while (string != null) {
            String[] array = string.split(" ");
            for(int number=0; number< array.length; number++){
                if(array[number].length() > longestWord.length()){
                    longestWord = array[number];
                }
            }
            string = bufferedReader.readLine();
        }
        System.out.println("Longest word in text file = " + longestWord);
    }
}
