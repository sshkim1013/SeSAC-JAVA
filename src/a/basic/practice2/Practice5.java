package a.basic.practice2;

// 문제 5: 약수 구하기
public class Practice5 {

    public static void main(String[] args) {
        int num = 24;

        System.out.print(num + "의 약수: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
