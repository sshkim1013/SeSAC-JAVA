package a.basic.practice;

/*
문제 3: 윤년 판별
연도를 입력받아 윤년인지 판별하세요.
윤년 조건:
    4로 나누어떨어지면서 100으로 나누어떨어지지 않거나
    400으로 나누어떨어지는 해
*/
public class Practice3 {

    public static void main(String[] args) {
        int year = 2024;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
    }
}
