package a.basic.practice2;
/*
문제 14: 구구단 특정 단 건너뛰기
- 2단부터 9단까지 구구단을 출력하되, 5단은 건너뛰세요. continue를 사용하세요.
*/
public class Practice14 {

    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {

            if (i == 5) {
                continue;
            }

            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("-----");
        }
    }
}
