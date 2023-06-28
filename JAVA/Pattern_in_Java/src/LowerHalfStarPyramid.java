public class LowerHalfStarPyramid {
    public int starPattern(int number){
        for(int row=1; row<=number; row++){

            for(int column=number; column>=1; column--){
                if(column>row){
                    System.out.print(" ");
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        return 0;
    }
}
