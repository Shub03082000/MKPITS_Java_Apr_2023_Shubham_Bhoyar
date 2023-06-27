public class ReverseRightAngleTriangleStarPattern {
    public void reverseRightAngleTriangleStarPattern(int number){
        for(int row=1; row<=number; row++){
            for(int column=5; column>=row; column--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
