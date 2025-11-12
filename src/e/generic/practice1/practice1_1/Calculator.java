package e.generic.practice1.practice1_1;

public class Calculator<T> {

    private T X;
    private T Y;

    public Calculator(T x, T y) {
        X = x;
        Y = y;
    }

    public T getFirst() {
        return X;
    }

    public T getSecond() {
        return Y;
    }

    public void printBoth() {
        System.out.println("첫 번째: " + X + ", 두 번째: " + Y);
    }

    public boolean areEqual() {
        return X.equals(Y);
    }
}
