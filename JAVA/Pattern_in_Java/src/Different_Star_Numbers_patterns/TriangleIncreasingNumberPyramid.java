package Different_Star_Numbers_patterns;

public class TriangleIncreasingNumberPyramid {
    public void triangleIncreasingNumber(int number){
        for(int row = 1; row <= number; row++){
            for(int space=number-1; space >= row; space--){
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
