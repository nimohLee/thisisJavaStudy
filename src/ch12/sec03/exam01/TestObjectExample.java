package ch12.sec03.exam01;

public class TestObjectExample {
    public static void main(String[] args) {
        TestObject testObject = new TestObject();
        Object object = new TestObject();
        if (testObject instanceof Object) {
            System.out.println("Object의 자손입니다.");
        }

        String test1 = new String("test");
        String test2 = new String("test");
        System.out.println(test1.equals(test2));
    }
}
