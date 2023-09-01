package JavaNewAdditionalConceptInterface;

import java.util.Scanner;

public class ClassInterface implements DisplayInterface1, Displayinterface2 {
    private int choice;

    public ClassInterface(int choice) {
        this.choice = choice;
    }

    @Override
    public void display() {
            switch (choice) {
                case 1:
                    DisplayInterface1.super.display();
                    break;
                case 2:
                    Displayinterface2.super.display();
                    break;
                default:
                    System.out.println("Invalid condition");

            }

    }
}
