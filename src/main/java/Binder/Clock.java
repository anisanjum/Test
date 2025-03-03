package Binder;

public class Clock {
    private static Clock instance;
    private Clock() {
    }


    public static synchronized Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public static void main(String[] args) {

        Clock clock = Clock.getInstance();
        Clock clock2 = Clock.getInstance();
        System.out.println("Clock Hashcode: " + clock.hashCode());
        System.out.println("Clock2 Hashcode: " + clock2.hashCode());

    }
}

