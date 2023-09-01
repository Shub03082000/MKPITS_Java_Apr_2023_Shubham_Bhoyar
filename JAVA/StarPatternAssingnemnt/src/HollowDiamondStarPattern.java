import java.util.Scanner;

public class HollowDiamondStarPattern extends HollowPattern{
    public void hollowPattern(int row) {
        String[][] array = new String[row][row];
        int middleValue = row / 2;

        for (int rowCounter = 0; rowCounter < row; rowCounter++) {
            for (int columnCounter = 0; columnCounter < row; columnCounter++) {
                if (rowCounter <= middleValue) {
                    if (columnCounter == middleValue - rowCounter || columnCounter == middleValue + rowCounter) {
//                        System.out.print("*");
                        array[rowCounter][columnCounter] = "*";
                    } else {
//                        System.out.print(" ");
                        array[rowCounter][columnCounter] = " ";
                    }
                } else {
                    if (columnCounter == middleValue - (row - 1 - rowCounter) || columnCounter == middleValue + (row - 1 - rowCounter)) {
//                        System.out.print("*");
                        array[rowCounter][columnCounter] = "*";
                    } else {
//                        System.out.print(" ");
                        array[rowCounter][columnCounter] = " ";
                    }
                }
            }
        }
        for (String[] hollowStar : array) {
            for (String printStar : hollowStar) {
                System.out.print(printStar);
            }
            System.out.println();
        }

    }
}
