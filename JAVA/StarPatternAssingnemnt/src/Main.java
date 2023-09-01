import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row size for hollow diamond pattern : ");
        int row = scanner.nextInt();
        HollowDiamondStarPattern hollowDiamondPattern = new HollowDiamondStarPattern();
        hollowDiamondPattern.hollowPattern(row);
    }
}