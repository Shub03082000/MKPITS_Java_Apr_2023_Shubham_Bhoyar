public class Main {
    public static void main(String[] args) {
        String str = "1234";
        int number = 1244;

        Integer y = new Integer(str);
        int a = y.intValue();
        System.out.println(a);

        Integer x = new Integer(number);//boxing
        int b = x.intValue();//unboxing
        System.out.println(b);

    }
}