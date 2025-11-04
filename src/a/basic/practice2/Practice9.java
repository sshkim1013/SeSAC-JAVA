package a.basic.practice2;

public class Practice9 {

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println(a + "과 " + b + "의 최소 공배수: " + (a * b / gcd(a, b)));
    }

    public static int gcd(int a, int b) {
        int r = a % b;

        if (r == 0) {
            return b;
        }

        return gcd(b, r);
    }
}
