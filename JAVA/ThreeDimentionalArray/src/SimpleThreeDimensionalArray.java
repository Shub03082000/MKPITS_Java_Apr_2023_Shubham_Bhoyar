import java.util.Scanner;

public class SimpleThreeDimensionalArray{
    public void ThreeDimensionalArrayProblem(int firstDimensionalValue, int secondDimensionalValue, int thirdDimensionalValue) {
        Scanner scanner = new Scanner(System.in);
        int[][][] array = new int[firstDimensionalValue][secondDimensionalValue][thirdDimensionalValue];

        //input from user
        System.out.println("Enter the 3D-array Values : ");
        for(int row=0; row<firstDimensionalValue; row++){
            for (int column=0; column<secondDimensionalValue; column++){
                for(int thirdArraySize=0; thirdArraySize<thirdDimensionalValue; thirdArraySize++){
                    array[row][column][thirdArraySize] = scanner.nextInt();
                }
            }
        }
        //output
        System.out.println("Display the 3D-array output : ");
        for(int row=0; row<firstDimensionalValue; row++){
            for (int column=0; column<secondDimensionalValue; column++){
                for(int thirdArraySize=0; thirdArraySize<thirdDimensionalValue; thirdArraySize++){
                    System.out.println("Array["+row+"]["+column+"]["+thirdArraySize+"], Value : " +array[row][column][thirdArraySize]);
                }
            }
        }
    }
}
