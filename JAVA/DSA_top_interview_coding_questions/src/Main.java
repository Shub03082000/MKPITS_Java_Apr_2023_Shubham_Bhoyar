import Arrays_Problems.FindLargestElement;
import Arrays_Problems.SecondLargestElement;
import Arrays_Problems.SecondSmallestElement;
import Arrays_Problems.SecondSmallestLargestElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//=================== largest element in array ===================================//
        FindLargestElement findLargestElement = new FindLargestElement();
        findLargestElement.largestElement();

//================== second largest element in an array ===========================//
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        secondLargestElement.secondLargest();

//================= second smallest element in an array ============================//
        SecondSmallestElement secondSmallestElement = new SecondSmallestElement();
        secondSmallestElement.secondSmallest();

//================ second largest and smallest element in an array =================//
        SecondSmallestLargestElement secondSmallestLargestElement = new SecondSmallestLargestElement();
        System.out.println("================ Second largest and smallest element ===================");
        secondSmallestLargestElement.ssmallestlargest();
    }
}