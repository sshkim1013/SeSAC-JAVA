package a.basic.practice2;

public class Practice11 {

    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        for (int i = n; i > 0 ; i--) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
