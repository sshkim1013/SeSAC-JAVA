package a.basic.practice2;

// 문제 3: 별 찍기 패턴 2
public class Practice3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
