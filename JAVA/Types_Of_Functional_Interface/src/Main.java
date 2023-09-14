import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Nagpur","Pune","Wardha","Amravati","Mumbai");
        Consumer<List<String>> upperCaseConsumer = list ->{
            for(int counter=1; counter< list.size(); counter++){
                list.set(counter, cities.get(counter).toUpperCase());
            }
        };
        //Consumer Interface
        Consumer<List<String>> printConsumer = list-> list.stream().forEach(c-> System.out.println(c));
        upperCaseConsumer.andThen(printConsumer).accept(cities);

        //Supplier Interface
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        //Predicate Interface
        System.out.println("------------- City Name starts with N --------------------");
        Predicate<String> nameStartsWithN = str -> str.startsWith("N");
        cities.stream().filter(nameStartsWithN).forEach(System.out::println);
        System.out.println("--------------- City Name contains A -----------------------");
        Predicate<String> nameConatainsA = str -> str.contains("A");
        cities.stream().filter(nameConatainsA).forEach(c -> System.out.println(c));
    }
}