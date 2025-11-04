package a.basic.practice2;

/*
문제 10: 피보나치 수열
- n번째 피보나치 수를 구하세요.
- 피보나치 수열: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
*/
public class Practice10 {

    public static void main(String[] args) {
        int N = 10;

        int fib1 = 0;
        int fib2 = 1;

        int result = 0;

        for (int i = 1; i < N; i++) {
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }

        System.out.println(result);
    }
}
