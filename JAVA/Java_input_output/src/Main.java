import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        MyBufferReaderClass myBufferReaderClass = new MyBufferReaderClass();
//        myBufferReaderClass.displaySum();

//======================== use of File class check whether our file present our current folder or not ===========================//
        File f = new File("abc.txt");
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        File ff = new File("c:\\users","abc.text");
        System.out.println(ff.exists());
        File d = new File("d:\\");
        String[] files = d.list();
        for(String fn : files){
            System.out.println(fn);
        }


    }
}