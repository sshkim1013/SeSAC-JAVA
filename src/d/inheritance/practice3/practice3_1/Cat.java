package d.inheritance.practice3.practice3_1;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }

    @Override
    public void eat() {
        System.out.println("생선을 먹습니다");
    }
}
