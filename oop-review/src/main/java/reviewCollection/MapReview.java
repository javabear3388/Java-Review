package reviewCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergiu");
        map.put(2, "Moses");

        System.out.println(map.get(2)); //Moses
        System.out.println(findFirstNonRepeating("Java Developer"));

//        System.out.println(Collections.frequency();

    }

    public static Character findFirstNonRepeating(String s){
        Map<Integer, Character> countCharMap = new HashMap<>();
        Character firstNonRepeat = null;
//        List<Character> charList = Arrays.asList(s.toCharArray());
        for (Character each: s.toCharArray()){
            countCharMap.put(Collections.frequency(Arrays.asList(s.toCharArray()),each), each);
            System.out.println(countCharMap);
        }
        System.out.println(countCharMap);
        firstNonRepeat = countCharMap.get(1);
        return firstNonRepeat;
    }

    public static Character findFirstNonRepeating2(String str){
        Map<Character,Integer> map=new HashMap<>();
        // for counting the chars
        int count;
        // counting chars and putting values in the hash map
        for(Character ch:str.toCharArray()){
            if(map.containsKey(ch)) {
                count=map.get(ch);
                map.put(ch, count+1);
            } else map.put(ch, 1);
        }
        // starting from string, check if the char count equals 1
        for(Character ch:str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }
        return null;
    }
}

