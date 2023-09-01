public class Main {
    public static void main(String[] args) {
        //Whatever method use in Math function that all are by default static it means we cannot access it through by creating an object,
        //we can access it directly through the class
        int n = -8;
        //1. abs(double a) - Returns the absolute value of a double value.
        // Printing value before applying absolute function
        System.out.println("Without applying Math.abs() method : " + n);
        int value = Math.abs(n);
        // Printing value after applying absolute function
        System.out.println("With applying Math.abs() method : " + value);

        //2. abs(float a) - Returns the absolute value of a float value.
        // Float
        float a = 123.0f;
        float b = -34.2323f;

        // Double
        double c = -0.0;
        double d = -999.3456;

        // Integer
        int e = -123;
        int f = -0;

        // Long
        long g = -12345678;
        long h = 98765433;

        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
        System.out.println(Math.abs(c));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(e));
        System.out.println(Math.abs(f));
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(Math.abs(Integer.MAX_VALUE));
        System.out.println(Math.abs(Long.MIN_VALUE));

        //3. acos(double a) - Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi.
        double num = 32.22;
        System.out.println(Math.acos(num)); //it is showing an output NaN(not an number)....

        //4. addExact(long x, long y) - Returns the sum of its arguments, throwing an exception if the result overflows a long.
        int x = 2334;
        int y = 2554;
        System.out.println(Math.addExact(x,y));

        //5. addExact(long x, long y) - Returns the sum of its arguments, throwing an exception if the result overflows a long.
        long p = 132413241324l;
        long q = 343243243435243l;
        System.out.println(Math.addExact(p,q));

        //6. cbrt(double a) - Returns the cube root of a double value.
        System.out.println(Math.cbrt(num));//it cube root of particular value.

        //7. ceil(double a) - Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
        /**
         * If the argument is Integer, then the result is Integer.
         * If the argument is NaN or an infinity or positive zero or negative zero, then the result is the same as the argument.
         * If the argument value is less than zero but greater than -1.0, then the result is negative zero.
         */
        double s = 4.3;
        double t = 1.0 / 0;
        double u = 0.0;
        double v = -0.0;
        double w = -0.12;

        System.out.println(Math.ceil(s));

        // Input Infinity, Output Infinity
        System.out.println(Math.ceil(t));

        // Input Positive Zero, Output Positive Zero
        System.out.println(Math.ceil(u));

        // Input Negative Zero, Output Negative Zero
        System.out.println(Math.ceil(v));

        // Input  less than zero but greater than -1.0
        // Output Negative zero
        System.out.println(Math.ceil(w));

        //8. floor(double a) - Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.
        System.out.println(Math.floor(a));

        // Input Infinity, Output Infinity
        System.out.println(Math.floor(b));

        // Input Positive Zero, Output Positive Zero
        System.out.println(Math.floor(c));

        // Input Negative Zero, Output Negative Zero
        System.out.println(Math.floor(d));

        // Input -2.3, Output -3.0
        // Nearest Integer(-3.0) < less than (-2.3)
        System.out.println(Math.floor(e));

        //random()
        System.out.println("16. random() method = "+ Math.random());//return value between 0.0 to 1.0

        //sqrt(double a)
        System.out.println("17. sqrt() method = " + Math.sqrt(16.6));

        //pow(double a, double b)
        System.out.println("pow(double a, double b) method = " + Math.pow(123.0,45.0));

    }
}