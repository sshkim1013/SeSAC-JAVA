package d.inheritance.practice3.practice3_2;

public abstract class Shape {

    protected int x;
    protected int y;
    protected String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // 템플릿 메서드
    public final void draw() {
        moveTo();
        setColor();
        drawShape();
    }

    void moveTo() {
        System.out.println("위치 이동: (" + x + ", " + y + ")");
    }

    void setColor() {
        System.out.println("색상 설정: " + color);
    }

    abstract void drawShape();
}
