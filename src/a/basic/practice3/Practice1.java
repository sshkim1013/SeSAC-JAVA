package a.basic.practice3;

import java.util.Arrays;

/*
문제 1: 배열 최댓값/최솟값
- 배열에서 최댓값과 최솟값을 찾으세요.
*/
public class Practice1 {

    public static void main(String[] args) {
        int[] numbers = {45, 23, 78, 12, 89, 34};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}
