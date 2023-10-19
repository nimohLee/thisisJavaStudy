package ch06.question;

public class Account {
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;

    private String accountNum;
    private String name;
    private int balance;

    public void setAccountNum(String accountNum) {
        this.name = accountNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
            return;
        }
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance(int balance) {
        this.balance += balance;
    }

    public void withdrawBalance(int withdraw) {
        this.balance -= withdraw;
    }
}
