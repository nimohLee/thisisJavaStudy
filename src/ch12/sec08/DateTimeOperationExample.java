package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재 시간: " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println(result1);
        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("result2 = " + result2);
        LocalDateTime result3 = now.plusDays(7);
        System.out.println("result3 = " + result3);
        System.out.println(result1.isAfter(result2));
    }
}
