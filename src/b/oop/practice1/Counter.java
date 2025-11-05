package b.oop.practice1;

public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void getCount() {
        System.out.println("현재 Count: " + count);
    }

    public void reset() {
        count = 0;
    }
}
