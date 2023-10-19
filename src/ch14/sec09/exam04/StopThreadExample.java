package ch14.sec09.exam04;

public class StopThreadExample {
    public static void main(String[] args) {
        StopThread stopThread = new StopThread();

        stopThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        stopThread.setStop(true);
    }
}
