package d.inheritance.practice3.practice3_1;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    @Override
    public void eat() {
        System.out.println("사료를 먹습니다");
    }
}
