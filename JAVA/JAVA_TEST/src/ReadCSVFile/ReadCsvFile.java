package ReadCSVFile;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFile {
    public static void displayReadCsvFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\CSV_file\\color_srgb.csv"));
            String string = bufferedReader.readLine();

            while (string != null){
                String[] color = string.split(",");
                for(int counter = 0; counter < color.length; counter++){
                    System.out.println("Color Name :" + color[0] + "\t" + "HXE :" + color[1] + "\t" + "RGB : " + color[2]);
                    string = bufferedReader.readLine();
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
