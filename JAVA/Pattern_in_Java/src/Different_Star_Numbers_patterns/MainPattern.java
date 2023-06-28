package Different_Star_Numbers_patterns;

import java.util.Scanner;

public class MainStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern : ");
        int number = scanner.nextInt();
// ========================================== Right Angle Star Pattern ========================================//
        System.out.println("================ Right angle Star Pattern ==================");
        RightAngleStarPattern rightAnglePattern = new RightAngleStarPattern();
        rightAnglePattern.rightAngleStarPattern(number);
        System.out.println();

// ========================================= Square star Pattern =============================================//
        System.out.println("=============== Square Star Pattern =======================");
        SquareStarPattern squarePattern = new SquareStarPattern();
        squarePattern.squareStarPattern(number);
        System.out.println();

// ========================================= Number Increasing Reverse Pyramid Pattern =============================================//
        System.out.println("=============== Number Increasing Reverse Pyramid Pattern =======================");
        NumberIncreasingReversePyramid numberIncreasingReversePyramid1 = new NumberIncreasingReversePyramid();
        numberIncreasingReversePyramid1.numberIncreasingReversePyramid(number);
        System.out.println();

// ========================================= Number Reverse Pyramid Pattern =============================================//
        System.out.println("=============== Number Reverse Pyramid Pattern =======================");
        NumberReversePyramid numberReversePyramid1 = new NumberReversePyramid();
        numberReversePyramid1.numberReversePyramid(number);
        System.out.println();
    }
}
