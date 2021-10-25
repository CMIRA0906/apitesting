package utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Examples {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("Car", "Train", "Bike", "Motorcycle", "Bus", "Canoe", "Bote");
        vehicles.stream().
                filter(vehicle -> vehicle.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .stream().limit(3)
                .forEach(word ->System.out.print("- " + word ));

    }

}
