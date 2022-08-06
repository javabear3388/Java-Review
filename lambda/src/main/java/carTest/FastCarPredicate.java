package carTest;

public class FastCarPredicate implements CarPredicate{
    @Override
    public boolean test(Car car) {
//        boolean result = false;
//        if(car.getTopSpeed()> 160){
//            result = true;
//        }
//        return result;
//    }
        return car.getTopSpeed() > 160;
    }
}
