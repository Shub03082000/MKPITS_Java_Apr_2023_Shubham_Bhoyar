package Different_Star_Numbers_patterns;

public class SquareStarPattern {
    public void squareStarPattern(int number){
        for(int row = 1; row <= number; row++){
            for(int column = 1; column <= number; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
