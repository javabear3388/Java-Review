package carTest;

public class NewCarPredicate implements CarPredicate{
    @Override
    public boolean test(Car car) {
//        boolean result = false;
//        if(car.getYear() > 2015){
//            result = true;
//        }
//        return result;
        return car.getYear() > 2015;
    }
}
