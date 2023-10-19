package ch03.sec09;

public class BitShiftExample1 {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        System.out.println( (lengthTop+lengthBottom) * height / 2.0);
        System.out.println( (lengthTop+lengthBottom) * height * 1.0 / 2);
        System.out.println( (double)(lengthTop+lengthBottom) * height / 2);
        System.out.println( (double)((lengthTop+lengthBottom) * height / 2));

        int x = 10;
        int y = 5;
        System.out.println((x > 7) && (y <= 5));
        System.out.println((x%3 == 2) || (y%2 != 1));
    }
}
