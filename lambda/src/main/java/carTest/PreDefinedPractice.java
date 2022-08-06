package carTest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class PreDefinedPractice {

    public static void main(String[] args) {

        // one parameter, return boolean
        Predicate<Integer> greaterThan10 = num -> num > 10;
        System.out.println(greaterThan10.test(15));

        //two input, return boolean
        BiPredicate<Integer, Integer> compare = (num1, num2) -> num1>num2;
        System.out.println(compare.test(11, 15));

        //one parameter , no return
        Consumer<String> printThis = s -> System.out.println("*** "+s);
        printThis.accept("Hello");

        //two parameter , no return
        BiConsumer<String, String> printBoth = (s1, s2) -> System.out.println(s1+"___"+s2);
        printBoth.accept("FistName", "LastName");

        //create a method takes string and integer
        BiConsumer<String, Integer> printNTimes = (s, n) -> {
            for(int i=0; i<n; i++){
                System.out.println(s);
            }

        };

        printNTimes.accept("Hey", 3);


        //another task
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Steven",6000);
        map.put("Mike",7000);
        map.put("Joe",3000);
        map.put("Harold",4500);
        map.put("Albus",5500);

        //print the name of the employees whose salary is grater than 5000 (forEach)
        map.forEach((key, value) -> {
            if(value>5000){
                System.out.println(key);
            }
        });

        map.forEach((key, value) -> {
            if(key.startsWith("A")){
                System.out.println(key+" = "+ value);
            }
        });


        //one parameter and return one
        Function<Integer,Integer> squared = x -> x*x;
        System.out.println(squared.apply(12));

        //no param and one return

        Supplier<String> value = () -> "some return";
        System.out.println(value.get());


        //create a lambda express takes 2 int array and combine to list of integer
        BiFunction<int[], int[], List<Integer>> combine = (a, b) -> {
          List<Integer> combineArray = new ArrayList<>();
            for (int num: a){
                combineArray.add(num);
            }
            for(int num: b){
                combineArray.add(num);
            }
            return combineArray;
        };
        List<Integer> result = combine.apply(new int[]{1,2,3}, new int[]{9,8,7});
        System.out.println(result);

        

    }





}
