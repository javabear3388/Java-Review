package funcationalinterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //*******************PREDICATE**********************//

//        Predicate<Integer> lesserThan =new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return interger <18;
//            }
//        };
//
//        lesserThan.test(50);

//        Predicate<Integer> lesserThan = public boolean test(Integer a){
//            return a<18;
//        }

        Predicate<Integer> lessThan = a -> a<18; //implemetation of Predicate interface's test() method
        System.out.println(lessThan.test(50)); //false


        //*******************CONSUMER**********************//
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(11); //11

        //*******************BiCONSUMER**********************//
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x+y);
        addTwo.accept(33,88); //121

        //*******************FUNCTION**********************//
        Function<String, String> fun = b -> "Hello "+b;
        System.out.println(fun.apply("HEY")); // Hello HEY

        Function<Integer, String> fun2 = b -> "Hello "+b;
        System.out.println(fun2.apply(3)); // Hello 3

        //************SUPPLIER******************//
        Supplier<Double> sup = () -> 3.88;
        System.out.println(sup.get()); //3.88

        Supplier<Double> sup2 = () -> Math.random();
        System.out.println(sup2.get()); //ram

        System.out.println("==============Use Function for Predicare?");
        Function<Integer, Boolean> remainder = i -> i<3;
        System.out.println(remainder.apply(3));


    }
}
