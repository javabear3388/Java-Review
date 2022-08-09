package task1;

import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        List<Dish> allInfo = DishData.getAll();

        System.out.println("======================dish's name calorie < 400");
        allInfo.stream()
                .filter(dish -> dish.getCalories()<400)
                .forEach(dish -> System.out.println(dish.getName()));

        System.out.println("========================Print the length of the name of each dish");
        allInfo.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("=========================Print Three High Caloric Dish Name(>300)");
        allInfo.stream()
                .filter(dish -> dish.getCalories()>300)
                .sorted((o1, o2) -> (o1.getCalories()>o2.getCalories())? -1 : (o2.getCalories()>o1.getCalories())? 1 :0)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);
//                .forEach(dish -> System.out.println(dish.getName()));


        System.out.println("Print all dish name that are below 400 calories in sorted");
        allInfo.stream()
                .filter(dish -> dish.getCalories() < 400)
//                .sorted((o1, o2) -> o1.getCalories().compareTo(o2.getCalories()))
//                .sorted((o1, o2) -> (o1.getCalories()>o2.getCalories())? -1 : (o2.getCalories()>o1.getCalories())? 1 :0)
                .sorted(comparing(Dish::getCalories).reversed())//ascending, descending
                .map(Dish::getName)
                .forEach(System.out::println);




    }


}
