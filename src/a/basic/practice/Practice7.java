package a.basic.practice;

/*
문제 7: BMI 계산 및 판정
- 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고 판정하세요.
- BMI 계산: 몸무게(kg) / (키(m) × 키(m))
- 판정 기준:
   - 18.5 미만: 저체중
   - 18.5 이상 23 미만: 정상
   - 23 이상 25 미만: 과체중
   - 25 이상: 비만
*/
public class Practice7 {

    public static void main(String[] args) {
        double height = 175.0;  // cm
        double weight = 70.0;   // kg
        double heightMeter = height / 100;
        double bmi = weight / (heightMeter * heightMeter);

        if (bmi > 25) {
            System.out.println("비만");
        } else if (bmi >= 23) {
            System.out.println("과체중");
        } else if (bmi >= 18.5) {
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }
    }
}
