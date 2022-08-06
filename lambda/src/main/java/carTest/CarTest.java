package carTest;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Aldi", 2020, 165));
        cars.add(new Car("BMW", 1995, 110));
        cars.add(new Car("Civic", 2018, 100));
        cars.add(new Car("Dodger", 2000, 185));
        cars.add(new Car("Eagle", 2012, 200));

//        System.out.println(filterCars(cars, new FastCarPredicate()));
//        System.out.println(filterCars(cars, new NewCarPredicate()));
//        System.out.println(filterCars(cars, new CarDurablePredicate()));

        System.out.println(filterCars(cars, car -> car.getTopSpeed() > 160));
        System.out.println(filterCars(cars, car -> car.getYear() >2015));

        System.out.println(filterCars2(cars, car -> car.getYear() >2015));
    }

    private static List<Car> filterCars(List<Car> cars, CarPredicate cp){
        List<Car> result = new ArrayList<>();
        for(Car car: cars){
            if(cp.test(car)){
                result.add(car);
            }
        }
        return result;
    }

    private static List<Car> filterCars2(List<Car> cars, Predicate<Car> p){
        List<Car> result = new ArrayList<>();
        for(Car car: cars){
            if(p.test(car)){
                result.add(car);
            }
        }
        return result;
    }


}
