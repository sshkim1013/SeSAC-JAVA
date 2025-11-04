package a.basic.practice;

/*
문제 6: 요일 판별
- 요일 번호를 입력받아 평일/주말을 구분하세요.
- 향상된 switch 문을 사용하세요.
*/
public class Practice6 {

    public static void main(String[] args) {
        int day = 7;

        String dayName = switch (day) {
            case 1 -> "월";
            case 2 -> "화";
            case 3 -> "수";
            case 4 -> "목";
            case 5 -> "금";
            case 6 -> "토";
            case 7 -> "일";
            default -> "잘못된 입력";
        };

        String type = switch (dayName) {
            case "월", "화", "수", "목", "금" -> "평일";
            case "토", "일" -> "주말";
            default -> "잘못된 입력";
        };

        System.out.println(day + ": " + dayName + "요일은 " + type + "입니다.");
    }
}
