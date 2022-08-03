package reviewInheritance;

public class Student {

    protected String name;
    protected int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printStudent(){
        System.out.println(name);
        System.out.println(age);
    }
}
