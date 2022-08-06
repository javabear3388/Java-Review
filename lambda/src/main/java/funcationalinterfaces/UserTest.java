package funcationalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Nick", "Ewan", 21));
        users.add(User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(User.builder().firstName("Tom").lastName("Hanks").age(55).build());
        users.add(User.builder().firstName("Ammy").lastName("Evan").age(15).build());
        users.add(User.builder().firstName("Emma").lastName("Pellard").age(25).build());

        //print all element in the list
//        Consumer<List<User>> display = userList -> {
//            for (User user: userList) {
//                System.out.println(user);
//            }
//        };
//        display.accept(users);

        printName(users, p -> true);

        System.out.println("===========");

        //print all users that last name starts with E
//        Consumer<List<User>> startE = userList2 -> {
//          for (User user: userList2){
//              if(user.getLastName().startsWith("E")){
//                  System.out.println(user);
//              }
//          }
//
//        };
//        startE.accept(users);
        printName(users, p -> p.getLastName().startsWith("E"));

    }

    private static void printName(List<User> users, Predicate<User> predicate){
        for (User user: users){
            if(predicate.test(user)){
                System.out.println(user.toString());
            }

        }
    };
}
