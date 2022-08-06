package doubleColonOp;
@FunctionalInterface
public interface Calculate {
    void calculate(int x, int y);
    default void m1(){
        System.out.println("123");
    };
}
