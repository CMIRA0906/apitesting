package utility;

/**
 * OverrideChildClass is an example about overriding on java
 * When it implements overriding from OverrideExample class
 *
 * @author Cristian_Mira
 * @version 1.0
 * since 10-22-2021
 */

public class OverrideChildClass extends OverrideExample{

    public static void main(String[] args) {

        OverrideChildClass overrideChildClass = new OverrideChildClass();
        overrideChildClass.methodToOverride();
    }

    /**
     * This method is a overriding implementation
     */
    @Override
    public void methodToOverride(){
        System.out.println("Showing child class");
    }


}
