import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMergingMain {
    public static void main(String[] args) {
        System.out.println("----------------------- create a list of list and merge it in one -----------------------");
        List<Integer> flatMapList = Stream.of(Arrays.asList(34,66,65),Arrays.asList(55,23,65,76)).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatMapList);
    }
}
