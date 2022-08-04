package reviewGenerics;

import java.util.List;

public class MyUtils<T> {

    // print all generic types
    public void printInfos(List<T> list){
        for (T each: list){
            System.out.println(each);
        }

        System.out.println("Total count: "+ list.size());
    }

    //take List get last item
    public T returnLast (List<T> list){
        return list.get(list.size()-1);
    }

    //take list, return last item name
//    public String returnLastItemName (List<T extends Student, Teacher> list ){
//        return list.get(list.size()-1).getName();
//    }

    //take list, return last item name
    public String returnLastItemName (List<T> list ) throws Exception {
        T lastItem = list.get(list.size()-1);
        if (lastItem instanceof Student){
            return ((Student) lastItem).getName();
        }else if(lastItem instanceof Teacher){
            return ((Teacher) lastItem).getName();
        }else{
            throw new Exception("TypeError");
        }
    }

}
