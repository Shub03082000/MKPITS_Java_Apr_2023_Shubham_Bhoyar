import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first array size : ");
        int firsDimensionalValue = scanner.nextInt();
        System.out.println("Enter the second array size : ");
        int secondDimensionalValue = scanner.nextInt();
        System.out.println("Enter the three array size : ");
        int thirdDimensionalValue = scanner.nextInt();

        SimpleThreeDimensionalArray threeDimensionalArray = new SimpleThreeDimensionalArray();
        threeDimensionalArray.ThreeDimensionalArrayProblem(firsDimensionalValue,secondDimensionalValue,thirdDimensionalValue);

    }
}