package CountLineInTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLineInTextFile {
    public static void countLine() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("xyz.txt"));
            int lineCounter = 0;
            String string = bufferedReader.readLine();
            while(string != null){
                lineCounter++;
                string = bufferedReader.readLine();
            }
            System.out.println("Number of lines in a file = " + lineCounter);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
