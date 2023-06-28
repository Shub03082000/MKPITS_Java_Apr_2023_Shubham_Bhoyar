public class NumberPyramidLowerHalf extends StarPattern {
    public int starPattern(int number){
        // lower half
        for(int row=number-1; row>=1; row--){
            //SPACES
            for(int space=1; space<=row; space++){
                System.out.print(" ");
            }

            //STARS
            for(int column=row; column<=number; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
