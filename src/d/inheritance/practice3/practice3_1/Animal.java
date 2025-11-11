package d.inheritance.practice3.practice3_1;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 일반 메서드
    public void displayInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

    // 추상 메서드
    public abstract void makeSound();
    public abstract void eat();
}
