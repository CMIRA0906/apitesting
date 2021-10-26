package utility;

import entity.User;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Examples {

    public static void main(String[] args) {

        Java8Examples java8Examples = new Java8Examples();

        List<String> vehicles = Arrays.asList("Car", "Train", "Bike", "Motorcycle", "Bus", "Canoe", "Bote");
        List<User> users = Arrays.asList(
                new User("Camilo", 3),
                new User("Esmeralda", 19),
                new User("Carlos", 23),
                new User("Juan", 41),
                new User("Cristian", 19));

        System.out.println(java8Examples.getUserNameListAsAStringList(users));
        System.out.println(java8Examples.getCarsUsingFilter(vehicles,"Tr"));


    }

    public List<String> getUserNameListAsAStringList(List<User> userList) {

        return userList.stream().
                filter(user -> user.getAge() >= 18)
                .map(User::getName)
                .collect(Collectors.toList());

    }

    public List<String> getCarsUsingFilter(List<String> vehicles, String nameStartsByFilter) {
        return vehicles.stream().
                filter(car -> car.startsWith(nameStartsByFilter))
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .stream().limit(3)
                .collect(Collectors.toList());
    }



}




