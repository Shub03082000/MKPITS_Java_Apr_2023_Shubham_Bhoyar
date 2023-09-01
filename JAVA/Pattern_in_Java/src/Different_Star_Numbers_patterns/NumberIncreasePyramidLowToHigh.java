package Different_Star_Numbers_patterns;

public class NumberIncreasePyramidLowToHigh {
    public void numberIncreaseLowToHigh(int number){
        for(int row = 1; row <= number; row++){
            for(int column = number; column >= row; column--){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
