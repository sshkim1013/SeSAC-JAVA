package b.oop;

public class Intro {

    public static void main(String[] args) {
        int width = 100;
        int height = 200;

        int area = calArea(width, height);
        System.out.println("넓이: " + area);
    }

    public static int calArea(int width, int height) {
        return width * height;
    }
}
