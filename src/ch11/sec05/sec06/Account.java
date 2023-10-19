package ch11.sec05.sec06;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws Exception{
        if (balance < money) {
            throw new Exception("잔고 부족: " + (money - balance) + " 모자람");
        }
        balance -= money;
    }

    public void makeRuntimeException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
