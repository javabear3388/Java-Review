package reviewInheritance;

public class Main {

    public static void main(String[] args) {

        printThis("A Method!");
        new Main().method1();

        GoodStudent nana = new GoodStudent("nana", 15);
        nana.printStudent();
    }

    public void method1(){
        System.out.println("===inside method 1===");
        System.out.println(check());
        System.out.println("===inside method 1===");
    }

    private static void printThis(String s){
        System.out.println(s);
    }

    private boolean check() {
        return false;
    }
}
