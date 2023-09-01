package Different_Star_Numbers_patterns;

import java.util.Scanner;

public class MainPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern : ");
        int number = scanner.nextInt();
// ========================================== 1. Right Angle Star Pattern ==========================================//
        System.out.println("================ Right angle Star Pattern ==================");
        RightAngleStarPattern rightAnglePattern = new RightAngleStarPattern();
        rightAnglePattern.rightAngleStarPattern(number);
        System.out.println();

// ========================================= 2. Square star Pattern ===============================================//
        System.out.println("=============== Square Star Pattern =======================");
        SquareStarPattern squarePattern = new SquareStarPattern();
        squarePattern.squareStarPattern(number);
        System.out.println();

// =============================== 3. Number Increasing Reverse Pyramid Pattern ===================================//
        System.out.println("=============== Number Increasing Reverse Pyramid Pattern =======================");
        NumberIncreasingReversePyramid numberIncreasingReversePyramid1 = new NumberIncreasingReversePyramid();
        numberIncreasingReversePyramid1.numberIncreasingReversePyramid(number);
        System.out.println();

// ========================================= 4. Number Reverse Pyramid Pattern =============================================//
        System.out.println("=============== Number Reverse Pyramid Pattern =======================");
        NumberReversePyramid numberReversePyramid1 = new NumberReversePyramid();
        numberReversePyramid1.numberReversePyramid(number);
        System.out.println();

// ========================================= 5. Reverse Right Angle Star Pattern =============================================//
        System.out.println("=============== Reverse Right Angle Star Pattern =======================");
        ReverseRightAngleStarPattern reverseRightAngleStarPattern = new ReverseRightAngleStarPattern();
        reverseRightAngleStarPattern.reverseRightAngleStar(number);
        System.out.println();

// ========================================= 6. Number Decreasing Reverse Pyramid Pattern =============================================//
        System.out.println("=============== Number Decreasing Reverse Pyramid Pattern =======================");
        NumberDecreasingReversePyramidPattern numberDecreasingReversePyramidPattern = new NumberDecreasingReversePyramidPattern();
        numberDecreasingReversePyramidPattern.numberDecreasingReversePyramid(number);
        System.out.println();

// ========================================= 7. Number Increase Pyramid Low To High =============================================//
        System.out.println("=============== Number Increase Pyramid Low To High =======================");
        NumberIncreasePyramidLowToHigh numberIncreasePyramidLowToHigh1 = new NumberIncreasePyramidLowToHigh();
        numberIncreasePyramidLowToHigh1.numberIncreaseLowToHigh(number);
        System.out.println();

// ========================================= 8. Left Half Pyramid =============================================//
        System.out.println("=============== Left Half Pyramid =======================");
        LeftHalfPyramid leftHalfPyramid1 = new LeftHalfPyramid();
        leftHalfPyramid1.leftHalfPyramid(number);
        System.out.println();

// ========================================= 9. Triangle Star Pattern =============================================//
        System.out.println("=============== Triangle Star Pattern =======================");
        TriangleStarPattern triangleStarPattern = new TriangleStarPattern();
        triangleStarPattern.triangleStar(number);
        System.out.println();

// ========================================= 10. Triangle Increasing Number Pyramid =============================================//
        System.out.println("=============== Triangle Increasing Number Pyramid =======================");
        TriangleIncreasingNumberPyramid triangleIncreasingNumberPyramid = new TriangleIncreasingNumberPyramid();
        triangleIncreasingNumberPyramid.triangleIncreasingNumber(number);
        System.out.println();

    }
}
