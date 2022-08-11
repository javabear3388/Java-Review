import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {

        Stream.iterate(0, n->n+2) //0, 2, 4, 6, 8
                .limit(5)
                .forEach(System.out::println);

        System.out.println("===========Print Fib==============");
        //(0,1),(1,2),(2,3),(3,5),(5, 5+3),(8, 5+8)

        Stream.iterate(new int[]{0,1}, t -> new int[] {t[1], t[0]+t[1]})
                .limit(5)
                .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ")"));

        Stream.iterate(new int[]{0,1}, t -> new int[] {t[1], t[0]+t[1]})
                .limit(8)
                .map( t -> t[0])
                .forEach(System.out::println);


    }
}
