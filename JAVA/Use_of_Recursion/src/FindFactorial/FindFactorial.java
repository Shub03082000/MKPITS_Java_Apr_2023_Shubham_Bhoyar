package FindFactorial;

import com.sun.security.jgss.GSSUtil;

public class FindFactorial {
    public static void factorial(int number){
        int factorial = 1;
//        for(int i=1; i<=number; i++){
//            factorial = factorial*i;
//        }
//        System.out.println(factorial);

        while(number>0){
            factorial= factorial*number;
            number--;

        }
        System.out.println(factorial);
    }
}
