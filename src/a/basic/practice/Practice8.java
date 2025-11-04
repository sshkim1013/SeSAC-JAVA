package a.basic.practice;

/*
문제 8: 최댓값 구하기
- 세 개의 정수 중 최댓값을 구하세요. if 문을 사용하세요.
*/
public class Practice8 {

    public static void main(String[] args) {
        int int1 = 10, int2 = 25, int3 = 17;
        int max = int1;  // 일단 첫 번째 값을 최댓값으로 가정

        if (int2 > max) {
            max = int2;
        }
        if (int3 > max) {
            max = int3;
        }

        System.out.println("최댓값: " + max);
    }
}
