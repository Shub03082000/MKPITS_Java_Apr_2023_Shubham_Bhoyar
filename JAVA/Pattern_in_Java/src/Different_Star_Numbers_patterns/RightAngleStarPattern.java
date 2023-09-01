package Different_Star_Numbers_patterns;

public class RightAngleStarPattern {
    public void rightAngleStarPattern(int number){
        for(int row = 1; row <= number; row++){
            for(int column = 1; column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
