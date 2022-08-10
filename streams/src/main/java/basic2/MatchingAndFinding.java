package basic2;

import task1.Dish;
import task1.DishData;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        //ALL MATCH
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //ANY MATCH
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("One of the dish is veggie");
        }

        //NON MATCH
        boolean isHealth2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealth2);

        //FIND ANY
        System.out.println("==============OPTIONAL (Find ANy)===========");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //FIND First
        System.out.println("==============OPTIONAL (Find First)===========");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish2.get());

    }
}
