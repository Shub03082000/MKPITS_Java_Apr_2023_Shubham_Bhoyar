import CountNumberOfCharWordsLinesFromFile.CountWordsCharacterLines;
import LongestWordInFile.LongestWordFromFile;
import ReadCSVFile.ReadCsvFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//============================================== By typecasting Student object =======================================//
//       Student student = new Student("Shubham",89);

//   ----------------- It read and store text in Object format ----------------//
//        FileReadWrite.writeObjectToFile(student);

//   -------------------- readObjectFromFile1 ----------------------------//
//        FileReadWrite.readObjectFromFile1(student);

//-------------- Return Student object in method(readObjectFromFile2) ----------//
//        System.out.println("Name : " + student.getName() + "\n" + "Marks : " + student.getMarks());
        
//================================= Append text to existing file =======================================================//
//        AppendTextToFile.writeToFile("xyz.txt");

//================================ Store text line by line in an array ==============================================//
//        StoreTextLineByLineInArray.storeTextLineByLine();

//   ----------------------------- second way ------------------------------------------//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter arrays integer value : ");
//        StoreTextLineByLineInArray.storeTextLineByLine(bufferedReader.readLine());

//=============================== Read first three Line in File ======================================================//
//        ReadFirstThreeLine.displayFirstThreeLine();


//============================ Count Number of lines in text file ===================================================//
//        CountLineInTextFile.countLine();

//=========================== Count Number of words in text file ====================================================//
//        CountWordsInTextFile.countWords();

//========================== Count Number of character in text file ==================================================//
//        CountCharacterInTextFile.CountCharacter();

//========================= Longest word in file =====================================================================//
//        LongestWordFromFile.longestWord();
//        LongestWordFromFile.longestWordUsingScanner();

//========================================= Read CSV file ============================================================//
//        ReadCsvFile.displayReadCsvFile();

//================================ Count line, words and character from file ========================================//
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name : ");
        String file = bufferedReader.readLine();
        CountWordsCharacterLines.displayCountWordsCharacterLines(file);
    }
}