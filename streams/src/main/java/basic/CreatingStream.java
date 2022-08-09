package basic;

import basic.Course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        // Creating stream from Array
        String[] courses = {"Java", "JS", "TS"};
        Stream<String> courseStream = Arrays.stream(courses);

        // Creating stream from Collection
        List<String> courseList = Arrays.asList("Java", "JS", "TS");
        Stream<String> courseStream2 = courseList.stream();

        // Creating stram from Class obj
        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("Spring",102),
                new Course("Microservices",103)
            );
        Stream<Course> courseStream3 = myCourses.stream();

        //Creating Stram from values
        Stream<Integer> stream = Stream.of(1,2,3,4);


    }
}
