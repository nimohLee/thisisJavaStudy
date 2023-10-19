package ch14.sec09.exam04;

public class InterruptedThreadExample {
    public static void main(String[] args) {
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        interruptThread.interrupt();
    }
}
