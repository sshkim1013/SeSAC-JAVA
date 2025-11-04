package a.basic.practice;

/*
문제 4: 삼각형 유효성 검사
- 세 변의 길이를 입력받아 삼각형을 만들 수 있는지 검사하세요.
- 삼각형 조건:
  - 세 변의 길이가 모두 양수
  - 가장 긴 변 < 나머지 두 변의 합
*/
public class Practice4 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // 세 변의 길이가 모두 양수
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                // 세 변 중 가장 긴 변의 길이가
                // 나머지 두 변의 길이의 합보다 커야 한다.
                System.out.println("삼각형입니다.");
            } else {
                System.out.println("삼각형이 아닙니다.");
            }
        } else {
            System.out.println("삼각형이 아닙니다.");
        }
    }
}
