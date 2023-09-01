package Different_Star_Numbers_patterns;

public class ReverseRightAngleStarPattern {
    public void reverseRightAngleStar(int number){
        for(int row = 1; row <= number; row++){
            for(int column = number; column >= row; column--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
