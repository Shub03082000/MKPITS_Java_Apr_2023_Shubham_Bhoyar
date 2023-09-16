import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,43,53,64,65,12,66);

        System.out.println("---------------------- print even number in list -------------------------");
        List list1 = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("---------------------- print sorted list ----------------------------------");
        List list2 = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("---------------------- print sum of even number in the list ---------------------------");
        int sumOfEvenNumber = numbers.stream().filter(x->x%2==0).reduce(0,(sum, i)-> sum+i);
        System.out.println(sumOfEvenNumber);

        System.out.println("--------------------- print square of elements in list --------------------------------");
        List square = numbers.stream().map(y -> y*y).collect(Collectors.toList());
        System.out.println(square);

        List<String> cities = Arrays.asList("Nagpur","Amravati","Pune","Mumbai","Banglore");
        System.out.println("----------------------- print String list -------------------------------------");
        cities.stream().map(c->c).collect(Collectors.toList());
        System.out.println(cities);

        System.out.println("----------------------- print sorted string in list -----------------------------");
        List list3 = cities.stream().sorted().collect(Collectors.toList());
        System.out.println(list3);

    }
}