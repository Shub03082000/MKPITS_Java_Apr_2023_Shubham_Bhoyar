import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingAndCountingMain {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Aniket","Abhishek","Avinash","Tejswini","Trupti","Pranay");
        System.out.println("---------------------- Grouping and Counting in stream ---------------------------");
        System.out.println(name.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));
    }
}
