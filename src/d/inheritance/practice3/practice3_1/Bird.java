package d.inheritance.practice3.practice3_1;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("짹짹!");
    }

    @Override
    public void eat() {
        System.out.println("모이를 먹습니다");
    }
}
