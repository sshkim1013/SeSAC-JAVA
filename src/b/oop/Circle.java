package b.oop;

public class Circle {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // 원의 넓이
    public double area() {
        return this.radius * this.radius * 3.14;
    }
}
