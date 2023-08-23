package CountCharacterInTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCharacterInTextFile {
    public static void CountCharacter() {
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("xyz.txt"));
            int characterCounter = 0;
            String string = bufferedReader.readLine();

            while (string != null){
                String[] array = string.split(" ");
                for(int number=0; number< array.length; number++){
                    characterCounter = characterCounter + array[number].length();
                    string = bufferedReader.readLine();
                }
            }
            System.out.println("Number of character in a text file is = " + characterCounter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
