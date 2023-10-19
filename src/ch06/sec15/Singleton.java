package ch06.sec15;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {

    }

    static Singleton getInstance() {
        return singleton;
    }
}
