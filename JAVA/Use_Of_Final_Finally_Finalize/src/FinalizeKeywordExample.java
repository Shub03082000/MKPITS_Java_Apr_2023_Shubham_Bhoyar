public class FinalizeKeywordExample {
    public static void main(String[] args)
    {
        FinalizeKeywordExample object = new FinalizeKeywordExample();
        // printing the hashcode
        System.out.println("Hashcode is: " + object.hashCode());
        object = null;
        // calling the garbage collector using gc()
        System.gc();
        System.out.println("End of the garbage collection");
    }
    // defining the finalize method
    protected void finalize()
    {
        System.out.println("Called the finalize() method");
    }
}
