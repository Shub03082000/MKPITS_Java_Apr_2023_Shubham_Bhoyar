package ReadfFirstThreeLineFromFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstThreeLine {
    public static void displayFirstThreeLine() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("xyz.txt"));
            String lineRead = bufferedReader.readLine();
            for(int i=0; i<3; i++){
                System.out.println("First three line : " + lineRead);
                lineRead = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
