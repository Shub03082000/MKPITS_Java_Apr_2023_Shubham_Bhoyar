public class MergeStarRightAngleLowerHalf extends StarPattern{
    public int starPattern(int number) {
        //LOWER HALF
        for(int row=number; row>=1; row--){
            //SPACES
            for(int space=1; space<=number-row; space++){
                System.out.print(" ");
            }

            //STARS
            for(int column=1; column<=2*row-1; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
}
