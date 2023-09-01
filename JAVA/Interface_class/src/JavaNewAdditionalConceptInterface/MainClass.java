package JavaNewAdditionalConceptInterface;

import JavaNewAdditionalConceptInterface.ClassInterface;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice(1 or 2) ");
        int choice = scanner.nextInt();
        ClassInterface classInterface = new ClassInterface(choice);
        classInterface.display();   
    }
}
