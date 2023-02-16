package lists;

import entity.User;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListServices {

    public static void main(String[] args) {
        //
        System.out.println("****************To print all users*********************");
        getUserList().forEach(user -> System.out.println(user.toString()));
        //
        System.out.println("**********************Filter users by their id contains a 10**********************");
         getUserList().stream().filter(user -> user.getId().contains("10"))
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("\u001B[34m**********************Filter users by id and print their names in UPPERCASE**********************\u001B[0m");
        getUserList().stream().filter(user -> user.getId().equals("109548231"))
                .collect(Collectors.toList()).forEach(filteredUser -> System.out.println(filteredUser.getName().toUpperCase()));

        System.out.println("\u001B[34m**********************using find any**********************\u001B[0m");

        Optional<User> firstNameStartsWithC= getUserList().stream()
                .filter(names -> names.getName().startsWith("C"))
                .findAny();
        if (firstNameStartsWithC.isPresent()){
            System.out.println("Name starting with C:".concat(firstNameStartsWithC.get().getName().toUpperCase()));
        }else {
            System.out.println("There is nothing to show");
        }

    }


    public static ArrayList<User> getUserList(){

        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("109548231","Cristian"));
        userList.add(new User("43983585","Olga"));
        userList.add(new User("3335855","Camilo"));

        return userList;
    }




}
