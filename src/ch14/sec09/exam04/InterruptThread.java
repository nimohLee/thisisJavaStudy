package ch14.sec09.exam04;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        try {
        while (true) {
            System.out.println("run");
            Thread.sleep(1);
        }
        } catch (InterruptedException e) {}
        System.out.println("자원을 반환하고 스레드를 종료합니다.");
    }
}
