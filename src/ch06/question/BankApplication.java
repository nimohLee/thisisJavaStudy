package ch06.question;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accounts = new Account[100];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            String input = scanner.nextLine();

            int index = 0;

            switch (input) {
                case "1":
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    String accountNum = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String accountPerson = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int initBalance = Integer.parseInt(scanner.nextLine());
                    Account account1 = new Account();
                    account1.setAccountNum(accountNum);
                    account1.setName(accountPerson);
                    account1.setBalance(initBalance);
                    accounts[index] = account1;
                    index++;
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    break;
                case "2":
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");
                    for (Account account : accounts) {
                        if (account == null) {
                            continue;
                        }
                        System.out.printf("%8s%s%-10d\n", account.getAccountNum(), account.getName(), account.getBalance());
                    }
                    break;
                case "3":
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    String targetAccountNum = scanner.nextLine();
                    System.out.print("예금액: ");
                    int addBalance = Integer.parseInt(scanner.nextLine());
                    for (Account account : accounts) {
                        if (account.getAccountNum().equals(targetAccountNum)) {
                            account.addBalance(addBalance);
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    String targetAccountNum2 = scanner.nextLine();
                    System.out.print("예금액: ");
                    int withdraw = Integer.parseInt(scanner.nextLine());
                    for (Account account : accounts) {
                        if (account.getAccountNum().equals(targetAccountNum2)) {
                            account.withdrawBalance(withdraw);
                            break;
                        }
                    }
                    break;
                case "5":
                    System.out.println("프로그램 종료");
                    System.exit(0);
            }
        }
    }
}
