package d.inheritance;

class Animal3 {

    void makeSound() {
        System.out.println("동물 소리!");
    }
}

class Dog3 extends Animal3 {

    @Override
    void makeSound() {
        System.out.println("멍멍!");
    }

    void bark() {
        System.out.println("왈왈!!!");
    }
}

class Cat3 extends Animal3 {

    @Override
    void makeSound() {
        System.out.println("야옹!");
    }

    void meow() {
        System.out.println("냐옹!!!");
    }
}

class Bird3 extends Animal3 {

    @Override
    void makeSound() {
        System.out.println("짹짹!");
    }
}

class Rabbit3 extends Animal3 {

    @Override
    void makeSound() {
        System.out.println("깡총!");
    }
}

public class PolyMain {

    public static void main(String[] args) {
//        Dog3 dog = new Dog3();
//        Cat3 cat = new Cat3();
//        Bird3 bird = new Bird3();
//
//        dog.makeSound();
//        cat.makeSound();
//        bird.makeSound();

        Animal3 animal1 = new Dog3();
        Animal3 animal2 = new Cat3();
        Animal3 animal3 = new Bird3();
        Animal3 animal4 = new Rabbit3();

        animal1.makeSound();    // 멍멍!
        animal2.makeSound();    // 야옹!
        animal3.makeSound();    // 짹짹!
        animal4.makeSound();    // 깡총!

        Dog3 dog1 = new Dog3();
        dog1.makeSound();   // 멍멍!
        dog1.bark();        // 왈왈!!!

        // 다형성 적용(업캐스팅)
        Animal3 dog2 = new Dog3();
        dog2.makeSound();   // 멍멍!
        // dog2.bark();   // 컴파일 에러

        Animal3 cat1 = new Cat3();
        cat1.makeSound();   // 야옹!
        // cat1.meow();   // 컴파일 에러

        Cat3 c2 = (Cat3) cat1;
        c2.meow();  // 냐옹!!!

        // instanceof 연산자
        System.out.println(cat1 instanceof Animal3);    // true
        System.out.println(cat1 instanceof Cat3);   // true
        System.out.println(cat1 instanceof Dog3);   // false


    }
}
