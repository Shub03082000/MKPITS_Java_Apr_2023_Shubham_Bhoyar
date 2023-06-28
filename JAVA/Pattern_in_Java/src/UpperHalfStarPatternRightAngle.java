public class UpperHalfStarPatternRightAngle extends StarPattern{
    public int starPattern(int number){
        //Upper HALF
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
