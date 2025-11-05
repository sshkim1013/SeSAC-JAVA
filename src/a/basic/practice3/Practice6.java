package a.basic.practice3;

import java.util.Arrays;

/*
문제 6: 배열에서 두 번째로 큰 수
- 배열에서 두 번째로 큰 수를 찾으세요.
*/
public class Practice6 {

    public static void main(String[] args) {
        int[] arr = {45, 23, 78, 12, 89, 80, 34};

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("배열에서 두 번째로 큰 수 : " + secondMax);
    }
}
