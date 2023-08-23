package StoreTextLineByLineInArray;

import java.io.*;

public class StoreTextLineByLineInArray {
//    public static void storeTextLineByLine() {
// ============================================== first way to store text Line By Line In an array ===================//

//            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Enter file name : ");
//            String[] array = new String[20];
//
//            try {
//                int number =0;
//                String str2 = bufferedReader1.readLine();
//                File file = new File(str2);
//
//                if (file.exists()) {
//                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//                    String str = bufferedReader.readLine();
//
//                    while (str != null) {
//                        array[number] = str;
//                        str = bufferedReader.readLine();
//                        number++;
//                    }
//                    for(String l : array){
//                        System.out.println(l);
//                    }
//
//                } else
//                    System.out.println("file does not exists");
//
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//    }

//=====================================  second way to store text Line By Line In an array  ==========================//
        public static void storeTextLineByLine(String arrayValue) {
            String[] array = new String[Integer.parseInt(arrayValue)];

            try {
                int number = 0;
                BufferedReader bufferedReader = new BufferedReader(new FileReader("xyz.txt"));
                String str = bufferedReader.readLine();
                while (str != null){
                    array[number] = str;
                    str=bufferedReader.readLine();
                    number++;
                }
                for(String value : array){
                    System.out.println(value);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

}
