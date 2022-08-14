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

        System.out.println("============MAP print");
        states.stream()
                .map(s -> s.getCity())
                .forEach(System.out::println);
        // ==> returns Stream<List<String>>
        //Still print 2 lists

        System.out.println("==========FLATMAP print");
        states.stream()
                .map(state -> state.getCity())
                .flatMap(l -> l.stream())// List::stream
                .forEach(System.out::println);
        //Print One list now

        System.out.println("==========FLATMAP print -2");
        states.stream()
                .flatMap(l -> l.getCity().stream())//list-> list.stream()
                .forEach(System.out::println);



    }


}
