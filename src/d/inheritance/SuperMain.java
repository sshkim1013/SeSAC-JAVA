package d.inheritance;

class Animal2 {
    String name;
    int age;
    String breed;

    // 생성자
    Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hello, I'm " + this.name + ", I'm " + this.age + " years old!");
    }
}

class Dog2 extends Animal2 {
    String breed;

    // 생성자 메서드가 없는 경우
    // Dog2() {} 기본 메서드를 자동으로 생성
    Dog2(String name, int age, String breed) {
        super(name, age);   // 부모의 생성자를 의미
        this.breed = breed;
    }

    void display() {
        System.out.println(this.breed);
        System.out.println(super.breed);
        System.out.println(breed);  // 가장 가까운 Dog2의 breed를 출력
    }

    @Override
    void introduce() {
        super.introduce();
    }
}

public class SuperMain {

    public static void main(String[] args) {
        Animal2 animal2 = new Animal2("동물", 0);
        Dog2 dog2 = new Dog2("초코", 3, "말티즈");

        System.out.println(animal2.breed);
        System.out.println(dog2.breed);

        dog2.display();
        dog2.introduce();
        animal2.introduce();
    }
}
