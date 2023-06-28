import java.util.Scanner;

public class  ReverseStarPyramidPattern extends StarPattern{
    public int starPattern(int number){
        for (int row = 1; row <= number; row++) {
            for (int space = 0; space<row; space++) {
                System.out.print(" ");
            }
            for (int column = 0; column <=(number-row); column++) {
//                if(%2==0){
                    System.out.print("* ");
//                }
//                else{
//                    System.out.print(" ");
//                }
            }
            System.out.println();
        }
        return 0;
    }
}
