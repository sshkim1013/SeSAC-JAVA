package d.inheritance;

// 클래스
class Animal7 {
    void eat() {
        System.out.println("EATING!");
    }
}

// 인터페이스 1
interface Swimmable {
    void swim();
}

// 인터페이스 2
interface Flyable {
    void fly();
}

// 인터페이스 3
interface Walkable {
    void walk();
}

// 다중 인터페이스 구현
// 하나의 클래스 상속
class Duck extends Animal7 implements Swimmable, Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("오리가 날아갑니다.");
    }

    @Override
    public void swim() {
        System.out.println("오리가 헤엄칩니다.");
    }

    @Override
    public void walk() {
        System.out.println("오리가 걸어 다닙니다.");
    }
}

// 단일 인터페이스 구현
// 하나의 클래스 상속
class Fish extends Animal7 implements Swimmable {

    @Override
    public void swim() {
        System.out.println("물고기가 헤엄칩니다.");
    }
}

public class MultiInterfaceMain {

    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();

        duck.swim();
        duck.fly();
        duck.walk();

        fish.swim();
    }
}
