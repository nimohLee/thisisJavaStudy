package ch13.sec05.question;

public class Container<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;

    }
}
