package DesignPattern.SingletonDP;

// For reference, refer Sriman Sir Design Pattern pdf.
public class SingletonDateUtilUsingEagerInitialization {

     // declare a static member of the same class-type in the class
    private static SingletonDateUtilUsingEagerInitialization instance = new SingletonDateUtilUsingEagerInitialization();

    // construct is declared as private
    private SingletonDateUtilUsingEagerInitialization() {
        // no-op
    }

    // declare a static method to create only one instance (static factory method)
    public static SingletonDateUtilUsingEagerInitialization getInstance() {
//        if (instance == null) {
//            instance = new DateUtilEagerInitialization();
//        }
        return instance;
    }
 }
