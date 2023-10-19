package ch14.sec09.exam03;

public class MyTest {
    public static void main(String[] args) {
        Thread threadA = new Thread(){
            @Override
            public void run() {
                setName("threadA");
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName());
            }
        };
        threadA.start();
    }
}
