package a.basic.practice3;

import java.util.Arrays;

/*
문제 2: 배열 뒤집기
- 배열을 역순으로 뒤집으세요.
*/
public class Practice2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        int[] reversedNumbers = new int[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            reversedNumbers[i] = numbers[numbers.length - 1 - i];
//        }
//
//        System.out.println(Arrays.toString(reversedNumbers));

        int left = 0;
        int right = numbers.length - 1;

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
