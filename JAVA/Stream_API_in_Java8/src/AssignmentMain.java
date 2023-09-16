import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AssignmentMain {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Aniket","Abhishek","Avinash","Tejswini","Trupti","Pranay");
        System.out.println("----------- Create a list of strings and use a stream to filter out strings that start with the letter A ------------");
        List list = name.stream().filter(filterObject->filterObject.contains("A")).collect(Collectors.toList());
        System.out.println(list);
        name.stream().filter(filterObject1-> filterObject1.contains("A")).forEach(System.out::println);

        System.out.println("---------------- create a list of integers and use a stream to double each integer in the list ------------------");
        List<Integer> numberList = Arrays.asList(12,13,21,7,8,9,11,6);
        List list2 = numberList.stream().map(number->number*2).collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("------------------- create a list of strings and use a stream to sort them in ascending order ---------------------");
        List sortedString = name.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedString);

        System.out.println("-------- create a list of integers and use a stream to filter out teh even numbers, double each remaining number, and then find the sum of teh double numbers ----------------------");
        System.out.println("-------------------- Even number list --------------------");
        List evenNumber = numberList.stream().filter(number->number%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);

        System.out.println("-------------------- Double of Remaining odd Number --------------------------");
        List doubleOfOddNumber = numberList.stream().filter(number->number%2 != 0).map(number->number*2).collect(Collectors.toList());
        System.out.println(doubleOfOddNumber);

        System.out.println("---------------------- sum of remaining double odd number -----------------------------");
        int remainingOddNumberSum= numberList.stream().filter(number->number%2 !=0).map(number->number*2).reduce(0,(sum,i)->sum+i);
        System.out.println(remainingOddNumberSum);

        System.out.println("---------------------- Grouping and Counting in stream ---------------------------");
        System.out.println(name.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));

        System.out.println("-------------------- list of random number using stream ---------------------------------");
        int[] randomNumber = new Random().ints().limit(10).toArray();
        System.out.println(Arrays.toString(randomNumber));
        IntStream.range(1,11).map(number-> number = new Random().nextInt()).forEach(System.out::println);

        System.out.println("----------------------- create a list of list and merge it in one -----------------------");
        List<Integer> flatMapList = Stream.of(Arrays.asList(34,66,65),Arrays.asList(55,23,65,76)).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatMapList);






    }
}
