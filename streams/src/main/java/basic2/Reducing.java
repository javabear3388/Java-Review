package basic2;

import task1.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 3, 9);
        int result = nums.stream()
                .reduce(999, (a, b)-> a+b);
        System.out.println(result);

        //No Initial Value
        Optional<Integer> result2 = nums.stream().reduce((a, b)-> a+b);
        System.out.println(result2);

        //Max and Min
        Optional<Integer> min = nums.stream().reduce(Integer::min);
        Optional<Integer> max = nums.stream().reduce(Integer::max);
        Optional<Integer> sum = nums.stream().reduce(Integer::sum);
        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());

        //Task
        int dishCount = DishData.getAll().stream().map(d -> 1).reduce(0,(a, b) -> a+b);
        System.out.println(dishCount);

        long dcount = DishData.getAll().stream().count();
        System.out.println(dcount);


    }
}
