import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyBufferReaderClass {
    public void displaySum() throws IOException {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two number : ");
        String num1 = br.readLine();
        String num2 = br.readLine();
//---------we can directly access parseInt() method by import (import static java.lang.Integer.*;)
        System.out.println("Addition of two number : " + Integer.parseInt(num1) + Integer.parseInt(num2));
    }
}
