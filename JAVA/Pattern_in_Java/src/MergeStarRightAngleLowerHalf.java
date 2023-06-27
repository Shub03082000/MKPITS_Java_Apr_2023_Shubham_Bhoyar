public class StarPatternDownRightAngleLowerHalf extends StarPattern{
    public int starPatternDownRightAngleLowerHalf(int number) {
        // LOWER HALF
        for (int row = number; row >= 1; row--) {
            for (int column = row; column >= 1; column--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
