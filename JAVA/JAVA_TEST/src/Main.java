import AppendTextToFile.AppendTextToFile;
import ReadfFirstThreeLineFromFile.ReadFirstThreeLine;
import StoreTextLineByLineInArray.StoreTextLineByLineInArray;
import WriteObjectToFile.FileReadWrite;
import WriteObjectToFile.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

//============================================== By typecasting Student object =======================================//
       Student student = new Student("Shubham",89);

//   ----------------- It read and store text in Object format ----------------//
        FileReadWrite.writeObjectToFile(student);

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
        ReadFirstThreeLine.displayFirstThreeLine();

    }
}