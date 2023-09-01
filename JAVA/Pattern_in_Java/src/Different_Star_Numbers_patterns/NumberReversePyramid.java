package Different_Star_Numbers_patterns;

public class NumberReversePyramid {
    public void numberReversePyramid(int number){
        for(int row = number; row >= 1; row--){
            for(int column = 1; column <= row; column++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
