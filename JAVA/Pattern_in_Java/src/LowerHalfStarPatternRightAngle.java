public class LowerHalfStarPatternRightAngle extends StarPattern{
    public int starPattern(int number){
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
        for(int row=1; row<=number; row++){
            for(int column=number; column>=row; column--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
