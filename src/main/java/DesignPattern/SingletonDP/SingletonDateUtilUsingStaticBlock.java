package DesignPattern.SingletonDP;

// For reference, refer Sriman Sir Design Pattern pdf.
public class SingletonDateUtilUsingStaticBlock {

     // declare a static member of the same class-type in the class
    private static SingletonDateUtilUsingStaticBlock instance;

     // static block execute only once when the class has loaded..
    static {
         instance= new SingletonDateUtilUsingStaticBlock();
    }

    // construct is declared as private
    private SingletonDateUtilUsingStaticBlock() {
        // no-op
    }

    // declare a static method to create only one instance (static factory method)
    public static SingletonDateUtilUsingStaticBlock getInstance() {
//        if (instance == null) {
//            instance = new DateUtilEagerInitialization();
//        }
        return instance;
    }
 }
