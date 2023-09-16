import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class InfiniteStreamRandomNumber {
    public static void main(String[] args) {
        System.out.println("-------------------- list of random number using stream ---------------------------------");
        int[] randomNumber = new Random().ints().limit(10).toArray();
        System.out.println(Arrays.toString(randomNumber));
        IntStream.range(1,11).map(number-> number = new Random().nextInt()).forEach(System.out::println);
    }
}
