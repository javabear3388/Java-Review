package basic2;

import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {

        Stream.iterate(0, n->n+2)    //Use limit
                .limit(5)
                .forEach(System.out::println);


    }
}
