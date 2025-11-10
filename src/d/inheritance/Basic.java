package d.inheritance;

class Animal {
    String name;
    int age;

    void eat() {
        System.out.println("eat!!!!!");
    }
}

class Dog extends Animal {
    String name;
    int age;
    String breed;

    // void eat() {
    //     System.out.println("eat!!!!!");
    // }

    void bark() {
        System.out.println("bark!!!!!");
    }
}

class Cat extends Animal {
    String name;
    int age;
    int life;

    // void eat() {
    //     System.out.println("eat!!!!!");
    // }

    void meow() {
        System.out.println("meow!!!!!");
    }
}

public class Basic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
