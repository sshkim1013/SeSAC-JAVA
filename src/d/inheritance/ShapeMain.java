package d.inheritance;

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

public class ShapeMain {

    public static void main(String[] args) {
        Circle circle = new Circle("red", 10);
        Rectangle rectangle = new Rectangle("blue", 10, 10);

        System.out.println("원의 넚이: " + circle.getArea());
        System.out.println("사각형의 넓이: " + rectangle.getArea());
    }
}
