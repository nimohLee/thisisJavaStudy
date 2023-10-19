package ch02.sec02;

import java.util.Scanner;

public class ScannerExampple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력:");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");

        byte byteValue = 10;
        float floatValue = 2.5F;
        double doubleValue = 2.5;

        float flaotresult = 5 + floatValue;
        double doubleResut = 5 + doubleValue;
    }
}
