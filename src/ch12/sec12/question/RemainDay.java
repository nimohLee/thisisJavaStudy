package ch12.sec12.question;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class RemainDay {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        long remainDay = localDateTime.until(LocalDateTime.of(2023, 12, 31, 0, 0, 0), ChronoUnit.DAYS);
        System.out.println(remainDay);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println(sdf.format(new Date()));
    }
}
