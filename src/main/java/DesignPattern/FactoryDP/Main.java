package DesignPattern.FactoryDP;

//https://www.youtube.com/watch?v=pt1IbV1aSZ4
//https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
public class Main {
    public static void main(String[] args) {
//        OS os = new AndroidOS();
//        os.typeOS();

        FactoryMethodClass fm = new FactoryMethodClass();
//        OS os = fm.getInstance("IOS");
//        OS os = fm.getInstance("WindowsOS");
        OS os = fm.getInstance("");
        os.typeOS();
    }
}
