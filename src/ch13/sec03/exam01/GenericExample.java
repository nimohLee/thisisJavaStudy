package ch13.sec03.exam01;

public class GenericExample {

    public static <T, A> Box<T> boxing(T t, A a) {
        Box<T> box = new Box<>();
        box.set(t);
        System.out.println(a.getClass().getSimpleName());
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100, "홍길동");
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동", 200);
        String strValue = box2.get();
        System.out.println(strValue);

    }
}
