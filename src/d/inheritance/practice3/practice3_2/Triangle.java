package d.inheritance.practice3.practice3_2;

public class Triangle extends Shape {

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int x, int y, String color, int side1, int side2, int side3) {
        super(x, y, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    void drawShape() {
        System.out.println("변 " + side1 + ", " + side2 + ", " + side3 + "] 삼각형 그리기");
    }
}
