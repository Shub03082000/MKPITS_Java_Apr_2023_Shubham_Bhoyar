package Class_File;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//=========================== This constructor check whether your file is exist in your current folder or not ====================//
        File file1 = new File("E:\\MKPITS\\MKPITS_Java_Apr_2023_Shubham_Bhoyar\\JAVA\\AbstractClass\\src");
        System.out.println(file1.exists());


        File file2 = new File("c:\\users","abc.txt");
        System.out.println(file2.exists());

//======================= This constructor return file of given pattern by considering it in string array =======================//
        File file3 = new File("E:\\MKPITS\\MKPITS_Java_Apr_2023_Shubham_Bhoyar\\JAVA\\AbstractClass\\src");
        //it return String type array
        String[] fileName = file3.list();
        for(String fn1 : fileName){
            System.out.println("list : "+fn1);
        }

        //it return File type array
        File[] fileName2 = file3.listFiles();
        for(File fn2 : fileName2){
            System.out.println("listFile : "+fn2);
        }

        File file4 = new File("MyBufferReaderClass.java");
        File file5 = new File("E:\\MKPITS\\MKPITS_Java_Apr_2023_Shubham_Bhoyar\\JAVA\\AbstractClass\\src");
        File file6 = new File("E:\\MKPITS\\MKPITS_Java_Apr_2023_Shubham_Bhoyar\\JAVA\\AbstractClass\\src\\Calculator\\Addition.java");
        File file7 = new File("E:\\MKPITS\\MKPITS_Java_Apr_2023_Shubham_Bhoyar\\JAVA\\AbstractClass\\src","MyBufferReaderClass.java");

        System.out.println("absolute path : " + file4.getAbsolutePath());
        System.out.println("absolute file : " + file4.getAbsoluteFile());
        System.out.println("Is File : " + file4.isFile());//it consider file name to Java_input_output that why it return - false
        System.out.println("getName(filename) : "+file2.getName());
        System.out.println("get Parent : "+file2.getParent());
        System.out.println("get Path : "+file2.getPath());
        System.out.println("getParentFile : "+ file2.getParentFile());
        System.out.println("hashcode : " + file2.hashCode());

        System.out.println("Can Execute : " + file4.canExecute());
        System.out.println("Can Execute : " + file5.canExecute());
        System.out.println("Can Execute : " + file6.canExecute());
        System.out.println("Can Execute : " + file7.canExecute());

        System.out.println("Can Read : " + file4.canRead());
        System.out.println("Can Read : " + file5.canRead());
        System.out.println("Can Read : " + file6.canRead());
        System.out.println("Can Read : " + file7.canRead());

        System.out.println("Can Write : " + file4.canWrite());
        System.out.println("Can Write : " + file5.canWrite());
        System.out.println("Can Write : " + file6.canWrite());
        System.out.println("Can Write : " + file7.canWrite());

        File file8 = new File("e:\\program.txt");
        File file9 = new File("e:\\demo.txt");
        File file10 = new File("e:\\program.txt");
        try {
            if(file9.createNewFile()){
                System.out.println("file created");
            }else{
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("compare to : " + file8.compareTo(file9));

        File file12 = new File("e:");
        System.out.println("Is directory : " + file8.isDirectory());
        System.out.println("Is directory : " + file12.isDirectory());

        System.out.println("equals : " + file8.equals(file10));
        System.out.println("Is hidden : " + file8.isHidden());

        System.out.println("last modified : " + file12.lastModified());
        System.out.println("length : " + file8.length());

//        System.out.println("to string : " + file8.toString());

    }
}
