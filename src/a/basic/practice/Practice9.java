package a.basic.practice;

/*
문제 9: 시험 합격 여부
- 세 과목의 점수를 입력받아 합격 여부를 판단하세요.
- 합격 조건:
  - 평균이 60점 이상
  - 모든 과목이 40점 이상
*/
public class Practice9 {

    public static void main(String[] args) {
        int math = 70, english = 80, science = 45;
        int average = (math + english + science) / 3;

        if (average > 60) {
            if (math < 40 || english < 40 || science < 40) {
                System.out.println("불합격(과목 낙제)");
            } else {
                System.out.println("합격");
            }
        } else {
            System.out.println("불합격(평균 미달)");
        }
    }
}
