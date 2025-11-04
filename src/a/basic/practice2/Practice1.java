package a.basic.practice2;

/*
문제 1: 구구단
- 2단부터 9단까지 구구단을 출력하세요.
*/
public class Practice1 {

    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+ "*" + j + " = " + (i * j));
            }
            System.out.println("-----");
        }
    }
}
