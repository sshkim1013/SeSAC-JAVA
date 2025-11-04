package a.basic.practice;

/*
문제 10: 할인율 계산
- 구매 금액에 따라 할인율을 적용하세요.
- 할인 기준:
  - 10만원 이상: 10% 할인
  - 5만원 이상: 5% 할인
  - 5만원 미만: 할인 없음
  - 추가: 회원이면 추가 5% 할인
*/
public class Practice10 {

    public static void main(String[] args) {
        int price = 120000;
        boolean isMember = true;
        double discountRate = 0.0;  // 총 할인율 (단위: %)

        if (price >= 100000) {
            discountRate = 10.0;
        } else if (price >= 50000) {
            discountRate = 5.0;
        } else {
            discountRate = 0.0;
        }

        if (isMember) {
            discountRate += 5.0;
        }

        double finalPrice = price * (1 - discountRate / 100);

        System.out.println("원가: " + price + "원");
        System.out.println("할인율: " + (int) discountRate + "%");
        System.out.println("최종 금액: " + (int) finalPrice + "원");
    }
}
