package utility;
/**
 * OverloadExample class is an example about Overloading on java
 * When it implements overriding from OverrideExample class
 * Every method takes a different way according its implementation
 *
 * @author Cristian_Mira
 * @version 1.0
 * since 10-22-2021
 */
public class OverloadExample {

    public static void main(String[] args) {
        showIT(1);
    }

    public static void showIT(int number){

        System.out.println("This is the number to print "+number);

    }

    public static void showIT(double number){

        System.out.println("This is the double number to print "+number);

    }

}
