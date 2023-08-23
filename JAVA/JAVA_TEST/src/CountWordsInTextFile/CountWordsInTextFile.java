package CountWordsInTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInTextFile {
    public static void countWords() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("xyz.txt"));
            int wordCounter = 0;
            String string = bufferedReader.readLine();
            while (string != null){
                wordCounter = wordCounter + string.split(" ").length;
                string = bufferedReader.readLine();
            }
            System.out.println("Number of words in text file is = " + wordCounter);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
