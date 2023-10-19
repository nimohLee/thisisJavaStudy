package ch14.sec06.exam01;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int money) throws InterruptedException {
        this.memory = money;
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    public void setMemory2(int memory) throws InterruptedException {
        synchronized (this) {
            this.memory = memory;
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}