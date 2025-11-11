package d.inheritance;

// 추상 클래스 1
abstract class Animal4 {
    String name;

    public Animal4(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println("sleeping zzz");
    }

    // 추상 메서드 선언
    abstract void makeSound();
}

// 추상 클래스 2
abstract class Shape4 {

    String color;

    public Shape4(String color) {
        this.color = color;
    }

    // 추상 메서드 선언
    abstract double getArea();
    abstract double getPerimeter();

    void displayColor() {
        System.out.println("색상: " + color);
    }
}

// 추상 클래스를 상속 받은 구현 클래스 1
class Circle4 extends Shape4 {

    double radius;

    public Circle4(String color, double radius) {
        super(color);   // 부모(추상 클래스)의 생성자를 호출하여 사용.
        this.radius = radius;
    }

    // 부모의 추상 메서드 구현 1
    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }

    // 부모의 추상 메서드 구현 2
    @Override
    double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}

// 추상 클래스를 상속 받은 구현 클래스 2
class Rectangle4 extends Shape4 {

    double width;
    double height;

    public Rectangle4(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
}

// 추상 클래스 3
abstract class Vehicle4 {
    abstract void start();
    abstract void stop();
    abstract int getSpeed();
}

class Car4 extends Vehicle4 {

    int speed;

    @Override
    void start() {
        speed = 30;
        System.out.println("차가 출발했습니다.");
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("차가 멈췄습니다.");
    }

    @Override
    int getSpeed() {
        return speed;
    }
}

class Bicycle4 extends Vehicle4 {

    int speed;

    @Override
    void start() {
        speed = 10;
        System.out.println("오토바이가 출발했습니다.");
    }

    @Override
    void stop() {
        speed = 0;
        System.out.println("오토바이가 멈췄습니다.");
    }

    @Override
    int getSpeed() {
        return speed;
    }
}

public class AbstractMain {

    public static void main(String[] args) {
        // 추상 클래스는 인스턴스화 하지 못한다!!
        // Animal4 animal = new Animal4("동물");  // 컴파일 에러 발생!

        Shape4 circle = new Circle4("red", 5);
        Shape4 rectangle = new Rectangle4("blue", 10, 15);

        // 추상 클래스(부모)의 일반 메서드 호출
        circle.displayColor();
        rectangle.displayColor();

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getPerimeter());
    }
}
