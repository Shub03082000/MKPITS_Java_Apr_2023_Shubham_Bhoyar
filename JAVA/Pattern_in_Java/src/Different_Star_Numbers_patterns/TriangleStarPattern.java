package Different_Star_Numbers_patterns;

public class TriangleStarPattern {
    public void triangleStar(int number){
        for(int row = 1; row <= number; row++){
            for(int space=number-1; space >= row; space--){
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
