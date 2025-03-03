package DesignPattern.SingletonDP;
 // This is one way to create a singleton class. Other ways to create a singleton class is mentioned
 // in DateUtilEagerInitialization.java, DateUtilStaticBlock.java etc.
 // For reference, refer Sriman Sir Design Pattern pdf.
public class SingletonDateUtil {

    // declare a static member of the same class-type in the class
    private static SingletonDateUtil instance;

    // construct is declared as private
    private SingletonDateUtil() {
        // no-op
    }

    // declare a static method to create only one instance (static factory method)
    public static SingletonDateUtil getInstance() {
        if (instance == null) {
            instance = new SingletonDateUtil();
        }
        return instance;
    }
}
