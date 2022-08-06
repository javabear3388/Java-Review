package doubleColonOp;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //zero arg constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getMake());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getMake());

        //one arg constructor
        Function<Integer, Car> f1 = model -> new Car(model);
        Car bmw = f1.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer, Car> f2 = Car::new;
        Car bmw2 = f2.apply(2011);
        System.out.println(bmw2);

        //two arg constructor
        BiFunction<String, Integer, Car> f3 = (make, model) -> new Car(make, model);
        Car carObj = f3.apply("Civid", 2009);
        System.out.println(carObj);

        BiFunction<String, Integer, Car> f4 = Car::new;
        Car carObj2 = f4.apply("Nissan", 2001);
        System.out.println(carObj2);


    }
}
