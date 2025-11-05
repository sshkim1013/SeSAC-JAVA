package a.basic.practice3;

import java.util.Arrays;

/*
문제 4: 배열 요소 개수 세기
- 배열에서 각 숫자가 몇 번 나오는지 세세요.
*/
public class Practice4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4};

        // 배열에서 가장 큰 수 찾기
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // 카운트 배열
        int[] count = new int[max + 1];

        // 개수 세기
        for (int num : arr) {
            count[num]++;
        }

        System.out.println(Arrays.toString(count));
    }
}
