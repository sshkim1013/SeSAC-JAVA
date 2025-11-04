package a.basic.practice;

/*
문제 5: 계절 판별
- 월을 입력받아 계절을 출력하세요. switch 문을 사용하세요.
*/
public class Practice5 {

    public static void main(String[] args) {
        int month = 11;

        String season = switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12, 1, 2 -> "겨울";
            default -> "잘못된 입력입니다.";
        };

        System.out.println(month + "월은 " + season + "입니다.");
    }
}
