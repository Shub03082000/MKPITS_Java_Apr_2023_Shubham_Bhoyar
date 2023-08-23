package CountNumberOfCharWordsLinesFromFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsCharacterLines {
    public static void displayCountWordsCharacterLines(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String string = bufferedReader.readLine();
        int lineCounter = 0;
        int wordCounter = 0;
        int characterCounter = 0;
        while (string != null){
            lineCounter++;
            wordCounter = wordCounter + string.split(" ").length;
            wordCounter++;
            String[] array = string.split(" ");
            for(int counter = 0; counter<array.length; counter++){
                characterCounter = characterCounter + array[counter].length();
                string = bufferedReader.readLine();
            }
        }
        System.out.println("Number of line in file = " + lineCounter);
        System.out.println("Number of words in file = " + wordCounter);
        System.out.println("Number of character in file = " + characterCounter);
    }
}
