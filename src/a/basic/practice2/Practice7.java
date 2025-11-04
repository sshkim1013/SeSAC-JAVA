package a.basic.practice2;

/*
문제 7: 소수 판별 최적화
- 문제 6을 최적화하세요. 2부터 √num까지만 확인하면 됩니다.
- 설명: num이 소수가 아니라면, num = a × b로 표현 가능합니다. 이때 a와 b 중 하나는 반드시 √num 이하입니다.
*/
public class Practice7 {

    public static void main(String[] args) {
        int num = 17;
        int count = 0;

        for (int i = 2; i < Math.sqrt(num); i++) {
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
