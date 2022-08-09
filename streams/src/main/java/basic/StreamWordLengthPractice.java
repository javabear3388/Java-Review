package basic;

import java.util.Arrays;
import java.util.List;

public class StreamWordLengthPractice {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
//                .map(word -> word.length())
                .map(String::length)
                .forEach(System.out::println);





    }




}
