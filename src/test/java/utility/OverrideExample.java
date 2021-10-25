package utility;
/**
 * OverrideExample is an example about overriding on java
 * This is father class
 *
 * @author Cristian_Mira
 * @version 1.0
 * since 10-22-2021
 */

public class OverrideExample {

    public static void main(String[] args) {

        OverrideExample overrideExample = new OverrideExample();
        overrideExample.methodToOverride();
    }

    public void methodToOverride(){

        System.out.println("Showing main class");
    }

}
