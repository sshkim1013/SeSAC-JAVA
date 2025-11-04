package a.basic.practice2;

/*
문제 12: 역순 숫자 출력
- 정수를 역순으로 출력하세요.
*/
public class Practice12 {

    public static void main(String[] args) {
        int num = 12345;

        while (num > 0){
            System.out.print(num % 10);   // 나머지 출력
            num /= 10;
        }
    }
}
