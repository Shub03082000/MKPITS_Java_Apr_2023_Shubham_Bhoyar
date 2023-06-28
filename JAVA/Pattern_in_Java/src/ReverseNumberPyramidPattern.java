public class ReverseNumberPyramidPattern extends StarPattern {
    public int starPattern(int number){
        // upper half
        for(int row=1; row<=number; row++){
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
