package ch05.sec05;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }

        boolean[] arr2 = new boolean[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(arr2[i]);
        }

        String[] arr3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(arr3[i]);
        }
    }
}
