package d.inheritance.practice4.practice4_1;

public class DrawableMain {

    public static void main(String[] args) {
        Drawable[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4)
        };

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}
