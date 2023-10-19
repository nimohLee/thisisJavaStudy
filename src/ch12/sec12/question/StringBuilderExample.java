package ch12.sec12.question;

import java.util.Random;
import java.util.StringTokenizer;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i <= 100; i++) {
            str += i;
        }
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());
        String strDel = "아이디,이름,패스워드";
        StringTokenizer st = new StringTokenizer(strDel, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println(Math.ceil(5.3));
        System.out.println(Math.floor(5.3));
        System.out.println(Math.max(5.3, 2.5));
        System.out.println(Math.round(5.7));
        Random random = new Random();
    }
}
