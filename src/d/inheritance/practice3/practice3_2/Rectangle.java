package d.inheritance.practice3.practice3_2;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    void drawShape() {
        System.out.println(width + " X " + height + "인 사각형 그리기");
    }
}
