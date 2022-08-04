package reviewCollection;

import java.net.CacheRequest;
import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        //1. create a set
        Set<Student> mySet = new HashSet<>();

        // 2 add element
        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbet"));
        mySet.add(new Student(9, "Muhabbet"));
        mySet.add(new Student(9, "Muhabbet")); //New object WILL BE added if no hash+equal methods

        System.out.println(mySet);

        Set<Integer> numSet=new HashSet<>();
        numSet.add(1);
        numSet.add(2);

        System.out.println(numSet);
        System.out.println(numSet.add(2)); // No Dupe => return "false"

        System.out.println("first repeating:  " +firstRepeatingChar("java developer"));

    }

    public static Character firstRepeatingChar(String s){
        Set<Character> nonDupSet = new HashSet<>();
        Character firstReaptingChar = null;
        for(Character each : s.toCharArray()){
            if(nonDupSet.add(each) == false){
                firstReaptingChar = each;
                break;
            }
        }
        return firstReaptingChar;

//        //Create a hashmap
//        Set<Character> chars=new HashSet<>();
//
//        // Iteration return ch if add returns false
//        for(Character ch:str.toCharArray()) if(!chars.add(ch)) return ch;
//        return null;
    }

}
