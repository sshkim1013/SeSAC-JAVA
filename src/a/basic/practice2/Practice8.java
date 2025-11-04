package a.basic.practice2;

public class Practice8 {

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println(a + "과 " + b + "의 최대 공약수: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        int r = a % b;

        if (r == 0) {
            return b;
        } else {
            return gcd(b, r);
        }
    }
}
