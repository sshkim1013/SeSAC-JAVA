package d.inheritance;

abstract class Animal5 {
    abstract void run();
    abstract void sleep();
    abstract void eat();
}

// 추상 클래스를 상속 받은 구현 클래스
class Dog5 extends Animal5 {
    void run() {}
    void sleep() {}
    void eat() {}
}

// ------------------------------

// 인터페이스
// 완전한 추상 클래스
// 내부의 모든 메서드는 추상 메서드
interface Animal6 {
    void run();
    void sleep();
    void eat();
}

// 인터페이스를 구현한 구현체 클래스
class Dog6 implements Animal6 {
    public void run() {}
    public void sleep() {}
    public void eat() {}
}

// ------------------------------

interface Drawable {
    void draw();
}

class Rectangle6 implements Drawable {
    private int width;
    private int height;

    public Rectangle6(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {

    }
}

public class InterfaceMain {

    public static void main(String[] args) {
        Animal6 dog = new Dog6();
        dog.run();
        dog.eat();
        dog.sleep();
    }
}
