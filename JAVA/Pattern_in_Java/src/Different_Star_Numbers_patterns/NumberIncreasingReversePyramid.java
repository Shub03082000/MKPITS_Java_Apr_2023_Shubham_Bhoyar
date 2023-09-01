package Different_Star_Numbers_patterns;

public class NumberIncreasingReversePyramid {
    public void numberIncreasingReversePyramid(int number){

        for(int row = number; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
