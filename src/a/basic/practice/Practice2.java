package a.basic.practice;

/*
문제 2: 학점 계산
점수를 입력받아 학점을 출력하세요.
학점 기준:
   90점 이상: A
   80점 이상: B
   70점 이상: C
   60점 이상: D
   60점 미만: F
*/
public class Practice2 {

    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
