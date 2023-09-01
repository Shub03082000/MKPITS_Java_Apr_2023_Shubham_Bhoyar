/**
 * If we create any final variable, it becomes constant, we cannot change the value of final variable....
 */
public class FinalKeywordWithVariable {
    public static void main(String[] args) {
        //This program gives us a value as 50
        int number = 10;
        number = number + 40;
        System.out.println(number);

        //After used of final keyword for variable
        final int number1 = 10;
        //Throw an error => cannot assign a value to final variable number
        //number1 = number1 + 40;
        System.out.println(number);
    }
}
