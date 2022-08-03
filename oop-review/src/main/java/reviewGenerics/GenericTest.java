package reviewGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

        printInfo(studentList);
        printInfos(teacherList);
        System.out.println(returnLast(studentList).getName());
        System.out.println(returnLast(teacherList));
        

    }

    public static void printInfo(List<Student> students){

        for (Student each: students){
            System.out.println(each);
        }

        System.out.println("Total count: "+ students.size());
    }

    // print all generic types
    public static <T> void printInfos(List<T> list){
        for (T each: list){
            System.out.println(each);
        }

        System.out.println("Total count: "+ list.size());
    }

    //give List get last item
    public static <T> T returnLast (List<T> list){
        return list.get(list.size()-1);
    }


}
