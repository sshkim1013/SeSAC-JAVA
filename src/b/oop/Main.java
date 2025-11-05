package b.oop;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        System.out.println("r1 사각형의 넓이: " + r1.area());

        Circle c1 = new Circle(5);
        System.out.println("c1 원의 넓이 " + c1.area());

        Rectangle r2 = new Rectangle(20, 20);
        Rectangle r3 = new Rectangle(100, 100);


    }
}
