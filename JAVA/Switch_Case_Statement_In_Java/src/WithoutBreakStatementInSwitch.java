public class WithoutBreakStatementInSwitch {
    public static void main(String[] args){

        int number = 5;
        switch (number) {
            default:
                System.out.println("Default");
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }
    }
}
//Output:-----
/* Default
    1
    2
    3
*/
