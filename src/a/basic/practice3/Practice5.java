package a.basic.practice3;

/*
문제 5: 2차원 배열 합계
- 2차원 배열의 모든 요소의 합을 구하세요.
*/
public class Practice5 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int[] ints : matrix) {
            for (int number : ints) {
                sum += number;
            }
        }

        System.out.println("합계: " + sum);
    }
}
