package reviewInheritance;

public class GoodStudent extends Student {

    public GoodStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void printStudent() {
        System.out.println("Good "+ name);
        System.out.println("Good " + age);
    }
}
