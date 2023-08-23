package AppendTextToFile;

import java.io.*;

public class AppendTextToFile {
    public static void writeToFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true));

        String choice;
        do {
            System.out.println("Enter string : ");
            String str = bufferedReader.readLine();
            bufferedWriter.write(str + "\n");
            System.out.println("Do you want to add another string (yes/no) : ");
            choice = bufferedReader.readLine();

        } while (choice.equalsIgnoreCase("yes"));
        bufferedWriter.close();

    }
}
