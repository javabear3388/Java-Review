package task4;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx= new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> states = Arrays.asList(va, tx);

        states.stream()
                .map(s -> s.getCity())
                .forEach(System.out::println);
        // ==> returns Stream<List<String>>

        states.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);





    }


}
