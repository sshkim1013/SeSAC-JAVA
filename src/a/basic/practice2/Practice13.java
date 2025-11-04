package a.basic.practice2;

/*
문제 13: 숫자 자릿수 합
- 정수의 각 자릿수를 더하세요.
*/
public class Practice13 {

    public static void main(String[] args) {
        int num = 12345;
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        System.out.println(result);
    }
}
