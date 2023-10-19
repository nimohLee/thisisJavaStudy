package ch05.sec05;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int[] scores;
        // 배열 생성은 생성자가 필요없네?
        scores = new int[] {83, 90, 87};
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }

        System.out.println("sum1 = " + sum1);
    }
}
