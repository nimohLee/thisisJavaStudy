package ch14.sec09.exam04;

public class StopThread extends Thread {
    private boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("run");
        }
        System.out.println("자원을 반환하고 스레드를 종료합니다.");
    }
}
