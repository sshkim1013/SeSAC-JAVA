package a.basic.practice2;

/*
문제 6: 소수 판별
- 주어진 숫자가 소수인지 판별하세요.
- 소수: 1과 자기 자신으로만 나누어떨어지는 수
*/
public class Practice6 {

    public static void main(String[] args) {
        int num = 17;
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(num + "은 소수입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");
        }
    }
}
