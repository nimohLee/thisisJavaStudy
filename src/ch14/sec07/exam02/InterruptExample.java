package ch14.sec07.exam02;

public class InterruptExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        printThread.interrupt();
    }
}
