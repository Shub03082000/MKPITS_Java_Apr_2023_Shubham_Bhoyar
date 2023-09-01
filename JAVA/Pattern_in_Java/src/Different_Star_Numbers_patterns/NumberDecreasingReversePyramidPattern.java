package Different_Star_Numbers_patterns;

public class NumberDecreasingReversePyramidPattern {
    public void numberDecreasingReversePyramid(int number){
        for(int row = 1; row <= number; row++){
            for(int column = number; column >= row; column--){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
