package ch14.sec09.exam04;

public class JoinThread extends Thread {
    private int sum = 0;

    public int getSum() {
        return sum;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            sum += i;
        }
    }
}
