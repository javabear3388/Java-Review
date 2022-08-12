import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 2, 10, 23);

        //empty() - isPresent()
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); //false
        System.out.println(Optional.of(nums).isPresent()); //true


        //ifPresent
        Optional<Integer> bigNumber = nums.stream().filter(x -> x>100).findAny();
        bigNumber.ifPresent(System.out::println); //no action if no result but doesn't throw exceptions

        //get
//        System.out.println(bigNumber.get()); //NoSuchElementException

        //orElse
        System.out.println(bigNumber.orElse(0)); //0


    }
}
