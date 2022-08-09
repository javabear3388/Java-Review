package basic;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,3,2,2,3);
//        myList.forEach(x-> System.out.println(x));//Takes Consumer
        myList.forEach(System.out::println); //Same

        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(i -> i%3==0)//Takes Predicate  // 3,3,3
                .distinct() //3
                .forEach(System.out::println);

        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter( i -> i%2 ==0) //2, 4, 2, 2
                .limit(1) //2
                .forEach(System.out::println);

        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%2==0) //2, 4, 2, 2
                .skip(2) //2, 2
                .forEach(System.out::println);

        //MAP
        System.out.println("MAP");
        myList.stream()
                .map(number -> number*2) //Takes Function
                .filter(i -> i%3 ==0)
                .forEach(System.out::println);


    }
}
