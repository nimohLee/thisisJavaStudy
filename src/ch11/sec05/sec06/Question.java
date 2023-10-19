package ch11.sec05.sec06;

import java.lang.reflect.Array;

public class Question {
    public static void main(String[] args) {
        String[] array = {"10k", "2a"};
        for (int i = 0; i <= 2; i++) {
            try {
                int value = Integer.parseInt(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("초과");
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
            }
        }
    }
}
