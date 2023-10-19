package ch04.sec07;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                if (j == 5) {
                    break Outter;
                }
            }
        }
    }
}
