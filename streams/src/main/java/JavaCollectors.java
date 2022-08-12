import task1.Dish;
import task1.DishData;
import task1.Type;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier) : is used to create a collection using collector
        System.out.println("================toCollection===================");
        ArrayList<Integer> evenNumsList = numbers.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(evenNumsList);


        Set<Integer> evenNumSet = numbers.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(evenNumSet);

        // toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("==============toList==================");
        List<Integer> numList2 = numbers.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toList());
        System.out.println(numList2);

        // toSet() : returns a Collector interface that gathers the input data into a new set
        System.out.println("========================toSet==================");
        Set<Integer> numSet2 = numbers.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toSet());
        System.out.println(numSet2);


        // toMap(Function, Function) : returns a Collector interface that gathers the input data into a new Map
        System.out.println("=====================toMap====================");
        Map<String, Integer> numMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(numMap);

        //counting() : returns a Collector that counts the number of the elements
        System.out.println("=======================Counting=============");
        Long evenCount = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);


        //summingInt(ToIntFunction): returns a Collector that produces the sum of an interger-value func
        System.out.println("=======================SummingInt=============");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //averagingInt(toIntFunction):  returns the average of an interger-value func
        System.out.println("=======================AveragingInt=============");
        Double avg = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(avg);

        //joining() : is used to join various elements of a character or string array into a single String obj
        System.out.println("=======================Joining=============");
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String courseString = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(courseString);

        //partitionBy(): is used to partition a stream of objs(or set of elements) based on a given predicate
        System.out.println("=======================Partition=============");
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        //groupingBy() : is used for groping objects by some property and storing results in a map instance
        System.out.println("********GroupingBy***********");
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);


    }
}
